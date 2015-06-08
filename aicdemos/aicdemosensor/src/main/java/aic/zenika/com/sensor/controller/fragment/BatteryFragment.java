package aic.zenika.com.sensor.controller.fragment;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.controller.delegate.BatteryDelegate;

public class BatteryFragment extends Fragment {

    private BatteryDelegate delegate = BatteryDelegate.getInstance();

    public BatteryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_battery, container, false);

        BroadcastReceiver batteryLevelReceiver = new BroadcastReceiver() {

            public void onReceive(Context context, Intent intent) {

                int currentLevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
                int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
                int level = -1;
                String  technology= intent.getExtras().getString(BatteryManager.EXTRA_TECHNOLOGY);
                int  temperature= intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0);
                int  voltage= intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE,0);

                if (currentLevel >= 0 && scale > 0) {
                    level = (currentLevel * 100) / scale;
                }

                TextView batteryLevel = (TextView) v.findViewById(R.id.battery_level);
                batteryLevel.setText(level + " %");

                TextView batteryHealth = (TextView) v.findViewById(R.id.battery_health);
                batteryHealth.setText(delegate.getBatteryHealth(intent.getIntExtra(BatteryManager.EXTRA_HEALTH, 0)));

                TextView batteryPlugged = (TextView) v.findViewById(R.id.battery_plugged);
                batteryPlugged.setText(delegate.getBatteryPlugged(intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0)));

                TextView batteryStatus = (TextView) v.findViewById(R.id.battery_status);
                batteryStatus.setText(delegate.getBatteryStatus(intent.getIntExtra(BatteryManager.EXTRA_STATUS, 0)));

                TextView batteryTechnology = (TextView) v.findViewById(R.id.battery_technology);
                batteryTechnology.setText(technology+"");

                TextView batteryTemperature = (TextView) v.findViewById(R.id.battery_temperature);
                batteryTemperature.setText(temperature+"");

                TextView batteryVoltage = (TextView) v.findViewById(R.id.battery_voltage);
                batteryVoltage.setText(voltage+"");
            }
        };

        delegate.registerBatteryReceiver(batteryLevelReceiver);

        return v;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        delegate.unregisterBatteryReceiver();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        delegate.unregisterBatteryReceiver();
    }

}
