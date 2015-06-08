package aic.zenika.com.sensor.controller.delegate;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;

/**
 * Created by thomas on 20/02/15.
 */
public class MainDelegate {
    private static volatile MainDelegate instance = null;

    /**
     * Default private constructor
     */
    private MainDelegate() {
        super();
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static MainDelegate getInstance() {
        if (MainDelegate.instance == null) {
            synchronized(MainDelegate.class) {
                if (MainDelegate.instance == null)
                    MainDelegate.instance = new MainDelegate();
            }
        }
        return MainDelegate.instance;
    }

    /**
     * Replace a fragment in an activity by putting a new fragment inside a given container
     * @param container Id of the container
     * @param fragment New fragment
     * @param activity Reference to an activity
     */
    public void replaceFragment(int container, Fragment fragment, Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(container, fragment)
                .commit();
    }
}
