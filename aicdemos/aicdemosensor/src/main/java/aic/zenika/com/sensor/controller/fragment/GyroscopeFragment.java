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

public class GyroscopeFragment extends Fragment implements SensorEventListener {

    private SensorDelegate sensorDelegate = SensorDelegate.getInstance();

    public GyroscopeFragment() {
        // Required empty public constructor
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_gyroscope, container, false);

        sensorDelegate.initializeSensor(Sensor.TYPE_GYROSCOPE);
        sensorDelegate.registerListener(Sensor.TYPE_GYROSCOPE, this);

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
        sensorDelegate.unregisterListener(Sensor.TYPE_GYROSCOPE, this);
    }


    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() != Sensor.TYPE_GYROSCOPE)
            return;

        Sensor s = event.sensor;

        float x = (float)(event.values[0]);
        float y = (float)(event.values[1]);
        float z = (float)(event.values[2]);

        TextView xTextView = (TextView) getActivity().findViewById(R.id.x_gyro);
        xTextView.setText(x+"");
        TextView yTextView = (TextView) getActivity().findViewById(R.id.y_gyro);
        yTextView.setText(y+"");
        TextView zTextView = (TextView) getActivity().findViewById(R.id.z_gyro);
        zTextView.setText(z+"");
    }
}
