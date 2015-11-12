package aic.zenika.com.sensor.controller.fragment;


import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.controller.delegate.SensorDelegate;

/**
 * A simple {@link Fragment} subclass.
 */
public class RotVectorSensorFragment extends Fragment implements SensorEventListener{
    private SensorDelegate sensorDelegate = SensorDelegate.getInstance();

    public RotVectorSensorFragment() {
        // Required empty public constructor
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_rot_vector_sensor, container, false);

        sensorDelegate.initializeSensor(Sensor.TYPE_ROTATION_VECTOR);
        sensorDelegate.registerListener(Sensor.TYPE_ROTATION_VECTOR, this);

        return v;
    }
    /*
        @Override
        public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            sensorDelegate.unregisterListener(Sensor.TYPE_ACCELEROMETER, this);
        }
    */
    @Override
    public void onDestroy() {
        super.onDestroy();
        sensorDelegate.unregisterListener(Sensor.TYPE_ROTATION_VECTOR, this);
    }


    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() != Sensor.TYPE_ROTATION_VECTOR)
            return;

        Sensor s = event.sensor;

        float x = (float)(event.values[0]);
        float y = (float)(event.values[1]);
        float z = (float)(event.values[2]);
        float cos = (float)(event.values[3]);

        TextView xTextView = (TextView) getActivity().findViewById(R.id.x_rot);
        xTextView.setText(x+"");
        TextView yTextView = (TextView) getActivity().findViewById(R.id.y_rot);
        yTextView.setText(y+"");
        TextView zTextView = (TextView) getActivity().findViewById(R.id.z_rot);
        zTextView.setText(z+"");
        TextView cosTextView = (TextView) getActivity().findViewById(R.id.cos_rot);
        cosTextView.setText(cos+"");
    }
}

