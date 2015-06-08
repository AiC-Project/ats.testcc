package aic.zenika.com.sensor.controller.fragment;


import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.io.IOException;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.view.element.CameraPreview;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends AbstractCameraFragment implements View.OnClickListener {

    private MediaRecorder mediaRecorder = null;
    private boolean isRecording = false;
    private View view = null;

    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_video, container, false);

        if(openCamera()) {
            preview = new CameraPreview(getActivity().getApplicationContext(),camera);
            FrameLayout previewLayout = (FrameLayout) view.findViewById(R.id.video_preview);
            previewLayout.addView(preview);

            Button button = (Button) view.findViewById(R.id.video_button);
            button.setOnClickListener(this);
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        if(isRecording)
            this.stop();
        else
            this.start();
    }

    private boolean prepareRecording() {
        mediaRecorder = new MediaRecorder();

        CamcorderProfile profile = CamcorderProfile.get(CamcorderProfile.QUALITY_HIGH);

        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(profile.videoFrameWidth, profile.videoFrameHeight);
        camera.setParameters(parameters);

        //preview.setLayoutParams(new FrameLayout.LayoutParams(profile.videoFrameWidth, profile.videoFrameHeight));

        camera.unlock();
        mediaRecorder.setCamera(camera);
        mediaRecorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);

        mediaRecorder.setOutputFormat(profile.fileFormat);
        mediaRecorder.setVideoEncoder(profile.videoCodec);

        mediaRecorder.setVideoSize(profile.videoFrameWidth,profile.videoFrameHeight);

        Log.w(TAG, "MediaRecorer=> W : " + preview.getPreviewSize().width + " " + "H : " + preview.getPreviewSize().height);

        mediaRecorder.setOutputFile(getOutputMediaFile(MediaType.VIDEO).toString());
        mediaRecorder.setPreviewDisplay(preview.getHolder().getSurface());

        try {
            mediaRecorder.prepare();
        } catch (IOException e) {
            Log.w(TAG,"Prepare media recorder failed " + e.getMessage());
            return false;
        }
        return true;
    }

    private void stop() {
        mediaRecorder.stop();
        this.releaseMediaRecorder();
        camera.lock();
        this.setButtonText("Start");
        isRecording = false;
    }

    private void start() {
        if(prepareRecording()) {
            mediaRecorder.start();
            this.setButtonText("Stop");
            isRecording = true;
        }
        else
            this.releaseMediaRecorder();
    }

    public void setButtonText(String text) {
        Button button = (Button) view.findViewById(R.id.video_button);
        button.setText(text);
    }

    private void releaseMediaRecorder(){
        if (mediaRecorder != null) {
            mediaRecorder.reset();   // clear recorder configuration
            mediaRecorder.release(); // release the recorder object
            mediaRecorder = null;
            camera.lock();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        releaseMediaRecorder();
        releaseCameraAndPreview();
    }
}
