package com.zenika.aic.core.automator;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.util.Log;

import java.util.Observable;

public class AiCAsyncSelector extends Observable implements Runnable {
	private UiSelector selector;
	private String assertString;
	private String errorString;
	private boolean result = true;
	
	public AiCAsyncSelector(String errorString,String text) {
		this.selector = new UiSelector().text(text);
		this.assertString = text;
		this.errorString = errorString;
	}
	
	public AiCAsyncSelector(UiSelector selector,String assertString, String errorString) {
		this.selector = selector;
		this.assertString = assertString;
		this.errorString = errorString;
	}
	
	@Override
	public void run() {
		Log.w("Searcher","Thread running");
		UiObject o = new UiObject(selector);
		try {
			result = o.getText().equals(assertString);
		} catch (UiObjectNotFoundException e) {
			result = false;
		}
		setChanged();
		notifyObservers();
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}	
	
	public String getError() {
		return errorString;
	}

}
