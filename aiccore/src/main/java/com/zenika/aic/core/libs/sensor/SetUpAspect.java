package com.zenika.aic.core.libs.sensor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by pierre on 11/12/15.
 */
@Aspect
public class SetUpAspect {

    private static final String POINTCUT_METHOD =
            "execution(@com.zenika.aic.core.libs.sensor.SetUp * *(..))";

    private static final String POINTCUT_CONSTRUCTOR =
            "execution(@com.zenika.aic.core.libs.sensor.SetUp *.new(..))";

    @Pointcut(POINTCUT_METHOD)
    public void methodSettingUp() {}

    @Pointcut(POINTCUT_CONSTRUCTOR)
    public void constructorSettingUp() {}

    @Around("methodSettingUp() || constructorSettingUp()")
    public void weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        //Put Methode here (???)
        Object target = joinPoint.getTarget();
        if (target instanceof Device) {
            target = new Device(appName, packageName, InstrumentationRegistry.getInstrumentation());
            // ...
        }
    }
}
