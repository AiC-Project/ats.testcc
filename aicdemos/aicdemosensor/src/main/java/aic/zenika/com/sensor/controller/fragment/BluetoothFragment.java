package aic.zenika.com.sensor.controller.fragment;

import android.app.ListFragment;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import aic.zenika.com.sensor.R;

public class BluetoothFragment extends ListFragment {

    private final static int REQUEST_CODE_ENABLE_BLUETOOTH = 0;
    private Set<BluetoothDevice> devices;
    private BluetoothAdapter bluetoothAdapter;
    private List bluetoothDevices;

    public BluetoothFragment() {
        // Required empty public constructor
    }

    private final BroadcastReceiver bluetoothReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                Toast.makeText(getActivity(), "New Device = " + device.getName(), Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_bluetooth, container, false);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null)
            Toast.makeText(getActivity(), "Bluetooth not available",
                    Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(getActivity(), "Bluetooth available",
                    Toast.LENGTH_SHORT).show();
            if (!bluetoothAdapter.isEnabled()) {
                Intent enableBlueTooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBlueTooth, REQUEST_CODE_ENABLE_BLUETOOTH);
            }

            IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
            getActivity().registerReceiver(bluetoothReceiver, filter);
            bluetoothAdapter.startDiscovery();
            devices = bluetoothAdapter.getBondedDevices();

            bluetoothDevices = new ArrayList();

            for (BluetoothDevice blueDevice : devices) {
                Toast.makeText(getActivity(), "Device = " + blueDevice.getName(), Toast.LENGTH_SHORT).show();
                bluetoothDevices.add(blueDevice.getAddress()+" : "+blueDevice.getBluetoothClass());
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, bluetoothDevices);
            setListAdapter(arrayAdapter);
        }

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
        bluetoothAdapter.cancelDiscovery();
        getActivity().unregisterReceiver(bluetoothReceiver);
    }
}
