package aic.zenika.com.sensor.controller.delegate;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import com.androidplot.ui.DynamicTableModel;
import com.androidplot.ui.SizeLayoutType;
import com.androidplot.ui.SizeMetrics;
import com.androidplot.xy.BoundaryMode;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.controller.activity.MainActivity;

/**
 * Created by pierre on 10/11/15.
 */
public class SensorDelegate {
    private static volatile SensorDelegate instance = null;

    private MainActivity mainActivity = null;

    private SensorManager accelerometerManager = null;
    private Sensor accelerometer = null;

    private SensorManager linearAccelerometerManager= null;
    private Sensor linearAccelerometer = null;

    private SensorManager barometerManager = null;
    private Sensor barometer = null;

    private SensorManager photometerManager = null;
    private Sensor photometer = null;

    private SensorManager thermometerManager = null;
    private Sensor thermometer = null;

    private SensorManager ambientThermometerManager = null;
    private Sensor ambientThermometer = null;

    private SensorManager proximitySensorManager = null;
    private Sensor proximitySensor = null;

    private SensorManager gravitometerManager = null;
    private Sensor gravitometer = null;

    private SensorManager magnetometerManager = null;
    private Sensor magnetometer = null;

    private SensorManager podometerManager = null;
    private Sensor podometer = null;

    private SensorManager gyroscopeManager = null;
    private Sensor gyroscope = null;

    private XYPlot accelerometerHistory = null;
    private SimpleXYSeries xSeries = null;
    private SimpleXYSeries ySeries = null;
    private SimpleXYSeries zSeries = null;

    /**
     * Default private constructor
     */
    private SensorDelegate() {
        super();
    }

    /**
     * Get sensor delegate unique instance
     * @return Main controller instance
     */
    public final static SensorDelegate getInstance() {
        if (SensorDelegate.instance == null) {
            synchronized(SensorDelegate.class) {
                if (SensorDelegate.instance == null)
                    SensorDelegate.instance = new SensorDelegate();
            }
        }
        return SensorDelegate.instance;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void initializeSensor(int sensor) {
        switch(sensor) {
            case Sensor.TYPE_ACCELEROMETER:
                accelerometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                accelerometer = accelerometerManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                linearAccelerometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                linearAccelerometer = linearAccelerometerManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
                break;
            case Sensor.TYPE_PRESSURE:
                barometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                barometer = barometerManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
                break;
            case Sensor.TYPE_LIGHT:
                photometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                photometer = photometerManager.getDefaultSensor(Sensor.TYPE_LIGHT);
                break;
            case Sensor.TYPE_TEMPERATURE:
                thermometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                thermometer = thermometerManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE);
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                ambientThermometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                ambientThermometer = ambientThermometerManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
                break;
            case Sensor.TYPE_PROXIMITY:
                proximitySensorManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                proximitySensor = proximitySensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
                break;
            case Sensor.TYPE_GRAVITY:
                gravitometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                gravitometer = gravitometerManager.getDefaultSensor(Sensor.TYPE_GRAVITY);
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                magnetometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                magnetometer = magnetometerManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
                break;
            case Sensor.TYPE_STEP_COUNTER:
                podometerManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                podometer = podometerManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
                break;
            case Sensor.TYPE_GYROSCOPE:
                gyroscopeManager = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
                gyroscope = gyroscopeManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
                break;
        }
    }

    public void createAccelerometerHistory(Context c, XYPlot xyPlot) {
        if(accelerometerHistory == null) {
            xSeries = new SimpleXYSeries("X");
            xSeries.useImplicitXVals();
            ySeries = new SimpleXYSeries("Y");
            ySeries.useImplicitXVals();
            zSeries = new SimpleXYSeries("Z");
            zSeries.useImplicitXVals();
        }

        accelerometerHistory = xyPlot;

        xyPlot.setRangeBoundaries(0, 10, BoundaryMode.FIXED);
        xyPlot.setDomainBoundaries(0, 100, BoundaryMode.AUTO);
        xyPlot.setHorizontalScrollBarEnabled(true);
        xyPlot.setDomainStepValue(1);

        xyPlot.getGraphWidget().setSize(new SizeMetrics(0, SizeLayoutType.FILL, 0, SizeLayoutType.FILL));

        xyPlot.getBackgroundPaint().setColor(Color.WHITE);
        xyPlot.setBorderStyle(XYPlot.BorderStyle.NONE, null, null);

        xyPlot.getGraphWidget().getBackgroundPaint().setColor(Color.WHITE);
        xyPlot.getGraphWidget().getGridBackgroundPaint().setColor(Color.TRANSPARENT);

        xyPlot.getGraphWidget().getDomainLabelPaint().setColor(Color.BLACK);
        xyPlot.getGraphWidget().getRangeLabelPaint().setColor(Color.BLACK);

        xyPlot.getGraphWidget().getDomainOriginLabelPaint().setColor(Color.BLACK);
        xyPlot.getGraphWidget().getDomainOriginLinePaint().setColor(Color.BLACK);
        xyPlot.getGraphWidget().getRangeOriginLinePaint().setColor(Color.BLACK);

        xyPlot.getGraphWidget().setMargins(10, 10, 10, 10);

        xyPlot.setBorderPaint(null);
        xyPlot.setPlotMargins(0, 0, 0, 0);
        xyPlot.setPlotPadding(0, 0, 0, 0);

        xyPlot.getLegendWidget().setTableModel(new DynamicTableModel(2, 2));
        xyPlot.getLegendWidget().setPadding(10, 10, 10, 10);

        Paint p = new Paint();
        p.setColor(c.getResources().getColor(R.color.Gray));
        p.setAlpha(70);

        xyPlot.getLegendWidget().setBackgroundPaint(p);
        xyPlot.getLegendWidget().setTextPaint(new Paint(R.color.Black));
        xyPlot.getLegendWidget().setSize(new SizeMetrics(60, SizeLayoutType.ABSOLUTE, 60, SizeLayoutType.ABSOLUTE));

        LineAndPointFormatter xFormat = new LineAndPointFormatter(c.getResources().getColor(R.color.Red), c.getResources().getColor(R.color.DarkRed), null, null);
        xFormat.setFillPaint(null);

        LineAndPointFormatter yFormat = new LineAndPointFormatter(c.getResources().getColor(R.color.Orange), c.getResources().getColor(R.color.DarkOrange), null, null);
        yFormat.setFillPaint(null);

        LineAndPointFormatter zFormat = new LineAndPointFormatter(c.getResources().getColor(R.color.Salmon), c.getResources().getColor(R.color.DarkSalmon), null, null);
        zFormat.setFillPaint(null);

        // add a new series' to the xyplot:
        xyPlot.addSeries(xSeries, xFormat);
        xyPlot.addSeries(ySeries, yFormat);
        xyPlot.addSeries(zSeries, zFormat);
    }

    public void addAccelerometerEntry(float x, float y, float z) {
        // add the latest history sample:
        if(xSeries.size()>100)
            xSeries.removeFirst();
        if(ySeries.size()>100)
            ySeries.removeFirst();
        if(zSeries.size()>100)
            zSeries.removeFirst();

        xSeries.addLast(null, x);
        ySeries.addLast(null, y);
        zSeries.addLast(null, z);

        // redraw the Plots:
        accelerometerHistory.redraw();
    }

    public void unregisterListener(int sensor, SensorEventListener listener) {
        SensorManager sm = null;
        switch(sensor) {
            case Sensor.TYPE_ACCELEROMETER:
                sm = accelerometerManager;
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                sm = linearAccelerometerManager;
                break;
            case Sensor.TYPE_PRESSURE:
                sm = barometerManager;
                break;
            case Sensor.TYPE_LIGHT:
                sm = photometerManager;
                break;
            case Sensor.TYPE_TEMPERATURE:
                sm = thermometerManager;
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                sm = ambientThermometerManager;
                break;
            case Sensor.TYPE_PROXIMITY:
                sm = proximitySensorManager;
                break;
            case Sensor.TYPE_GRAVITY:
                sm = gravitometerManager;
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                sm = magnetometerManager;
                break;
            case Sensor.TYPE_STEP_COUNTER:
                sm = podometerManager;
                break;
            case Sensor.TYPE_GYROSCOPE:
                sm = gyroscopeManager;
                break;
        }
        sm.unregisterListener(listener);
    }

    public void registerListener(int sensor, SensorEventListener listener) {
        SensorManager sm = null;
        Sensor s = null;
        switch(sensor) {
            case Sensor.TYPE_ACCELEROMETER:
                sm = accelerometerManager;
                s = accelerometer;
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                sm = linearAccelerometerManager;
                s = linearAccelerometer;
                break;
            case Sensor.TYPE_PRESSURE:
                sm = barometerManager;
                s = barometer;
                break;
            case Sensor.TYPE_LIGHT:
                sm = photometerManager;
                s = photometer;
                break;
            case Sensor.TYPE_TEMPERATURE:
                sm = thermometerManager;
                s = thermometer;
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                sm = ambientThermometerManager;
                s = ambientThermometer;
                break;
            case Sensor.TYPE_PROXIMITY:
                sm = proximitySensorManager;
                s = proximitySensor;
                break;
            case Sensor.TYPE_GRAVITY:
                sm = gravitometerManager;
                s = gravitometer;
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                sm = magnetometerManager;
                s = magnetometer;
                break;
            case Sensor.TYPE_STEP_COUNTER:
                sm = podometerManager;
                s = podometer;
                break;
            case Sensor.TYPE_GYROSCOPE:
                sm = gyroscopeManager;
                s = gyroscope;
                break;
        }
        sm.registerListener(listener,s,SensorManager.SENSOR_DELAY_UI);
    }
}
