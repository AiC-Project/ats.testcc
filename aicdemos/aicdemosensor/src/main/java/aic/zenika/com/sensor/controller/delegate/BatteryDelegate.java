package aic.zenika.com.sensor.controller.delegate;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

import aic.zenika.com.sensor.controller.activity.MainActivity;

/**
 * Created by thomas on 20/02/15.
 */
public class BatteryDelegate {

    private static volatile BatteryDelegate instance = null;

    private MainActivity mainActivity = null;
    private BroadcastReceiver batteryReceiver = null;

    /**
     * Default private constructor
     */
    private BatteryDelegate() {
        super();
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static BatteryDelegate getInstance() {
        if (BatteryDelegate.instance == null) {
            synchronized(BatteryDelegate.class) {
                if (BatteryDelegate.instance == null)
                    BatteryDelegate.instance = new BatteryDelegate();
            }
        }
        return BatteryDelegate.instance;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void registerBatteryReceiver(BroadcastReceiver batteryReceiver) {
        this.batteryReceiver = batteryReceiver;
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        mainActivity.registerReceiver(batteryReceiver, filter);
    }

    public void unregisterBatteryReceiver() {
        mainActivity.unregisterReceiver(batteryReceiver);
    }

    public String getBatteryHealth(int code) {
        String s = "";
        switch (code) {
            case 1:
                s = "Unknown";
                break;
            case 2:
                s = "Good";
                break;
            case 3:
                s = "Overheat";
                break;
            case 4:
                s = "Dead";
                break;
            case 5:
                s = "Over voltage";
                break;
            case 6:
                s = "Unspecified failure";
                break;
            case 7:
                s = "Cold";
                break;
        }
        return s;
    }

    public String getBatteryPlugged(int code) {
        String s = "";
        switch (code) {
            case 1:
                s = "AC";
                break;
            case 2:
                s = "USB";
                break;
            case 4:
                s = "Wireless";
                break;
            default :
                s = "Not plugged";
                break;
        }
        return s;
    }

    public String getBatteryStatus(int code) {
        String s = "";
        switch (code) {
            case 1:
                s = "Unknown";
                break;
            case 2:
                s = "Charging";
                break;
            case 3:
                s = "Discharging";
                break;
            case 4:
                s = "Not charging";
                break;
            case 5:
                s = "Full";
                break;
        }
        return s;
    }
}
