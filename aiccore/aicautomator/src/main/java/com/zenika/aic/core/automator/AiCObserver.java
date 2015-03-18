package com.zenika.aic.core.automator;

import android.support.test.uiautomator.UiAutomatorTestCase;

import java.util.Observable;
import java.util.Observer;

public abstract class AiCObserver extends UiAutomatorTestCase implements Observer {
	protected int observableNumber = 0;
	
	public void addObservable(Observable o) {
		o.addObserver(this);
		observableNumber++;
	}
}
