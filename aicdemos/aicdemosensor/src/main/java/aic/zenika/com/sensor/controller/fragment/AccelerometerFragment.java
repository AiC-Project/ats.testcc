package aic.zenika.com.sensor.controller.fragment;

import android.app.Fragment;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidplot.xy.XYPlot;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.controller.delegate.SensorDelegate;

public class AccelerometerFragment extends Fragment implements SensorEventListener {

    private SensorDelegate sensorDelegate = SensorDelegate.getInstance();

    public AccelerometerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_accelerometer, container, false);

        sensorDelegate.initializeSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        sensorDelegate.registerListener(Sensor.TYPE_LINEAR_ACCELERATION,this);
        sensorDelegate.createAccelerometerHistory(v.getContext(), (XYPlot) v.findViewById(R.id.aprHistoryPlot));

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
        sensorDelegate.unregisterListener(Sensor.TYPE_LINEAR_ACCELERATION, this);
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() != Sensor.TYPE_LINEAR_ACCELERATION)
            return;

        Sensor s = event.sensor;

        float x = (float) (event.values[0] /** Math.random()*/);
        float y = (float) (event.values[1] /** Math.random()*/);
        float z = (float) (event.values[2] /** Math.random()*/);

        sensorDelegate.addAccelerometerEntry(x,y,z);

        TextView xTextView = (TextView) getActivity().findViewById(R.id.accelerometer_x);
        xTextView.setText(x+"");

        TextView yTextView = (TextView) getActivity().findViewById(R.id.accelerometer_y);
        yTextView.setText(y + "");

        TextView zTextView = (TextView) getActivity().findViewById(R.id.accelerometer_z);
        zTextView.setText(z + "");

        TextView nameTextView = (TextView) getActivity().findViewById(R.id.accelerometer_name);
        nameTextView.setText(s.getName());

        TextView vendorTextView = (TextView) getActivity().findViewById(R.id.accelerometer_vendor);
        vendorTextView.setText(s.getVendor());

        TextView powerTextView = (TextView) getActivity().findViewById(R.id.accelerometer_power);
        powerTextView.setText(s.getPower()+"");

        TextView rangeTextView = (TextView) getActivity().findViewById(R.id.accelerometer_range);
        rangeTextView.setText(s.getMaximumRange()+"");

        TextView resolutionTextView = (TextView) getActivity().findViewById(R.id.accelerometer_resolution);
        resolutionTextView.setText(s.getResolution()+"");
    }
}
