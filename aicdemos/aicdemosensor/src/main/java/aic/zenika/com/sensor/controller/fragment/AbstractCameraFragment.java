package aic.zenika.com.sensor.controller.fragment;

import android.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import aic.zenika.com.sensor.view.element.CameraPreview;

/**
 * Created by thomas on 27/04/15.
 */
public abstract class AbstractCameraFragment extends Fragment {
    protected static final String TAG = "_CameraFragment_T_";
    protected static final String STORAGE = "AiCDemoSensor";

    protected enum MediaType {
        IMAGE,
        VIDEO
    };

    protected Camera camera = null;
    protected CameraPreview preview = null;

    protected boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA))
            return true;
        else
            return false;
    }

    protected boolean openCamera() {
        boolean opened = false;

        try {
            //releaseCameraAndPreview();
            camera = Camera.open();
            opened = (camera != null);
        } catch (Exception e) {
            Log.e(TAG, "Failed to open Camera");
            e.printStackTrace();
        }

        return opened;
    }

    /** Create a file Uri for saving an image or video */
    private static Uri getOutputMediaFileUri(MediaType type){
        return Uri.fromFile(getOutputMediaFile(type));
    }

    /** Create a File for saving an image or video */
    protected static File getOutputMediaFile(MediaType type){
        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), STORAGE);

        if (! mediaStorageDir.exists()){
            if (! mediaStorageDir.mkdirs()){
                Log.d(TAG, "Failed to create directory");
                return null;
            }
        }

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File mediaFile = null;

        switch (type) {
            case IMAGE:
                mediaFile = new File(mediaStorageDir.getPath() + File.separator + "IMG_"+ timeStamp + ".jpg");
                break;
            case VIDEO:
                mediaFile = new File(mediaStorageDir.getPath() + File.separator + "VID_"+ timeStamp + ".mp4");
                break;
        }

        return mediaFile;
    }

    protected void releaseCameraAndPreview() {
        if(preview != null)
            preview.stopPreviewAndFreeCamera();
    }
}
