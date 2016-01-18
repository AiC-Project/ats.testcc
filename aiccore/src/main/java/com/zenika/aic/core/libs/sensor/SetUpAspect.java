package com.zenika.aic.core.libs.sensor;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.pm.PackageManager;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


/**
 * Created by pierre on 11/12/15.
 */

@Aspect
public class SetUpAspect extends Activity {

    private static final String POINTCUT_METHOD =
            "execution(@com.zenika.aic.core.libs.sensor.annotation.SetUp * *(..))";

    private static final String POINTCUT_CONSTRUCTOR =
            "execution(@com.zenika.aic.core.libs.sensor.annotation.SetUp *.new(..))";

    @Pointcut(POINTCUT_METHOD)
    public void methodSettingUp() {
        Log.v("coucou","intoAspect");
    }

    @Pointcut(POINTCUT_CONSTRUCTOR)
    public void constructorSettingUp() {
        Log.v("coucou","intoAspect");
    }

    @Around("methodSettingUp() || constructorSettingUp()")
    public void weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        Object target = joinPoint.getTarget();
        Log.v("coucou","intoAspect");
        if(target instanceof Device) {
            //Device device = ((Device) target).getDeviceInstance();
            PackageManager packageManager= getApplicationContext().getPackageManager();
            String packageName = getApplicationContext().getPackageName();
            String appName = (String) packageManager.getApplicationLabel(
                    packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA));
            Instrumentation instrument = InstrumentationRegistry.getInstrumentation();
            //device = new Device(appName, packageName, instrument);
            joinPoint.proceed();
        }
    }
}