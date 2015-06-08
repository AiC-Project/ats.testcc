package aic.zenika.com.sensor.controller.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.controller.delegate.BatteryDelegate;
import aic.zenika.com.sensor.controller.delegate.MainDelegate;
import aic.zenika.com.sensor.controller.delegate.SensorDelegate;
import aic.zenika.com.sensor.controller.fragment.AccelerometerFragment;
import aic.zenika.com.sensor.controller.fragment.BatteryFragment;
import aic.zenika.com.sensor.controller.fragment.HomeFragment;
//import aic.zenika.fr.sensor.controller.fragment.CustomMapFragment;
import aic.zenika.com.sensor.controller.fragment.MapFragment;
import aic.zenika.com.sensor.controller.fragment.PictureFragment;
import aic.zenika.com.sensor.controller.fragment.VideoFragment;
import aic.zenika.com.sensor.controller.listener.DrawerItemClickListener;
import aic.zenika.com.sensor.view.adapter.DrawerAdapter;
import aic.zenika.com.sensor.view.element.DrawerItem;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = mDrawerTitle = getTitle();
        mNavigationArray = new ArrayList<DrawerItem>();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mNavigationArray.add(new DrawerItem(R.string.battery, R.drawable.ic_action_battery_red));
        mNavigationArray.add(new DrawerItem(R.string.accelerometer, R.drawable.ic_action_battery_red));
        mNavigationArray.add(new DrawerItem(R.string.map, R.drawable.ic_action_battery_red));
        mNavigationArray.add(new DrawerItem(R.string.picture, R.drawable.ic_action_battery_red));
        mNavigationArray.add(new DrawerItem(R.string.video, R.drawable.ic_action_battery_red));
        mNavigationArray.add(new DrawerItem(R.string.home, R.drawable.ic_action_home_red));

        mDrawerList.setAdapter(new DrawerAdapter(this,R.layout.drawer_item, mNavigationArray));

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener(this));

        BatteryDelegate.getInstance().setMainActivity(this);
        SensorDelegate.getInstance().setMainActivity(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    /**
     * Update navigation drawer title and change fragment
     * @param position Position of the navigation drawer item
     */
    public void selectItem(int position) {

        Fragment fragment = null;

        switch(position) {
            case 0:
                fragment = new BatteryFragment();
                break;
            case 1:
                fragment = new AccelerometerFragment();
                break;
            case 2:
                fragment = new MapFragment();
                break;
            case 3:
                fragment = new PictureFragment();
                break;
            case 4:
                fragment = new VideoFragment();
                break;
            default:
                fragment = new HomeFragment();
                break;
        }

        MainDelegate.getInstance().replaceFragment(R.id.content_frame,fragment,this);

        // Highlight the selected item, update the title, and close the drawer
        if(position > 0) {
            mDrawerList.setItemChecked(position, true);
            setTitle(getResources().getString(mNavigationArray.get(position).getNameId()));
        }

        mDrawerLayout.closeDrawer(mDrawerList);

    }

    /**
     * Manage button events
     * @param v Button used
     */
    public void displayFragment(View v) {
        /*
        switch(v.getId()) {
            case R.id.play_btn:
                this.selectItem(1);
                break;
            case R.id.results_btn:
                this.selectItem(2);
                break;
            case R.id.rules_btn:
                this.selectItem(3);
                break;
        }*/
    }
}
