package com.zenika.aic.core.automator;

import android.support.test.uiautomator.UiAutomatorTestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class AiCAsyncSelectorGroup implements Observer {
	private int observableNumber = 0;
	private List<Thread> threads = new ArrayList<Thread>();
	private boolean result = true;
	
	public AiCAsyncSelectorGroup(UiAutomatorTestCase testCase,ArrayList<AiCAsyncSelector> selectors){
		for(AiCAsyncSelector s : selectors) {
			this.addObservable(s);
			Thread t = new Thread(s);
			threads.add(t);
			t.start();
		}

		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof AiCAsyncSelector) {
			AiCAsyncSelector selector = (AiCAsyncSelector)o;
			result = result && selector.getResult();
			observableNumber --;
			if(observableNumber <= 0) {
				synchronized (this) {
					notify();
					stopThreads();
				}
			}
		}
	}

	public boolean getResult() {
		return result;
	}
	
	public void stopThreads() {
		for(Thread t : threads) {
			t = null;
			threads.remove(t);
		}
	}
	
	public void addObservable(Observable o) {
		o.addObserver(this);
		observableNumber++;
	}
}
