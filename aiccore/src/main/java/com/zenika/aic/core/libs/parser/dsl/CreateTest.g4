grammar CreateTest;

@header {
	package com.zenika.aic.demo.sensor;
	import android.hardware.Sensor;
	import android.support.test.InstrumentationRegistry;
	import android.support.test.runner.AndroidJUnit4;
	import android.test.InstrumentationTestCase;
	import android.util.Log;

	import com.zenika.aic.core.libs.sensor.Device;
	import com.zenika.aic.core.libs.sensor.SensorsPacket;

	import org.junit.Before;
	import org.junit.Test;
	import org.junit.runner.RunWith;
}

@members {
	private Device device;
	String appName = "Sensor";
	String packageName = "aic.zenika.com.sensor";


    @Before
    public void init() {
        device = new Device(appName, packageName, InstrumentationRegistry.getInstrumentation());
    }
}

list
@after {System.out.println(count+" ints");}
: INT {count++;} (',' INT {count++;} )*
;

INT : [0-9]+ ;
WS : [ \r\t\n]+ -> skip ;
