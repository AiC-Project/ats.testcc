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

public class ThermometerFragment extends Fragment implements SensorEventListener {

    private SensorDelegate sensorDelegate = SensorDelegate.getInstance();

    public ThermometerFragment() {
        // Required empty public constructor
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_thermometer, container, false);

        sensorDelegate.initializeSensor(Sensor.TYPE_TEMPERATURE);
        sensorDelegate.registerListener(Sensor.TYPE_TEMPERATURE, this);

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
        sensorDelegate.unregisterListener(Sensor.TYPE_TEMPERATURE, this);
    }


    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() != Sensor.TYPE_TEMPERATURE)
            return;

        Sensor s = event.sensor;

        float temp = (float)(event.values[0]);

        TextView pressureTextView = (TextView) getActivity().findViewById(R.id.temperature);
        pressureTextView.setText(temp+" °C");
    }
}
