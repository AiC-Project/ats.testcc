package aic.zenika.com.sensor.controller.fragment;


import android.hardware.Camera;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.view.element.CameraPreview;

/**
 * A simple {@link Fragment} subclass.
 */
public class PictureFragment extends AbstractCameraFragment implements Camera.PictureCallback, View.OnClickListener {

    public PictureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_picture, container, false);

        if(openCamera()) {
            preview = new CameraPreview(getActivity().getApplicationContext(),camera);
            FrameLayout previewLayout = (FrameLayout) view.findViewById(R.id.picture_preview);
            previewLayout.addView(preview);

            Button button = (Button) view.findViewById(R.id.picture_button);
            button.setOnClickListener(this);
        }

        return view;
    }

    @Override
    public void onClick(View v) {
        camera.takePicture(null, null, this);
    }

    @Override
    public void onPictureTaken(byte[] data, Camera camera) {
        File pictureFile = getOutputMediaFile(MediaType.IMAGE);
        if (pictureFile == null) {
            Log.w(TAG, "Error creating media file");
            return;
        }

        try {
            FileOutputStream fos = new FileOutputStream(pictureFile);
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {
            Log.w(TAG, "File not found: " + e.getMessage());
        } catch (IOException e) {
            Log.w(TAG, "Error accessing file: " + e.getMessage());
        }
    }
}
