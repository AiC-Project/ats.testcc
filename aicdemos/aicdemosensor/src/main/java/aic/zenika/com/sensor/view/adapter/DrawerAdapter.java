package aic.zenika.com.sensor.view.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import aic.zenika.com.sensor.R;
import aic.zenika.com.sensor.view.element.DrawerItem;

/**
 * Custom adapter to represent navigation drawer data
 * @author Thiebaud Thomas
 *
 */
public class DrawerAdapter extends ArrayAdapter<DrawerItem> {
	 
    Context context;
    List<DrawerItem> drawerItemList;
    int layoutResID;

    /**
     * Constructor
     * @param context Context
     * @param layoutResourceID Layout to represent a data
     * @param listItems List of items
     */
    public DrawerAdapter(Context context, int layoutResourceID,List<DrawerItem> listItems) {
          super(context, layoutResourceID, listItems);
          this.context = context;
          this.drawerItemList = listItems;
          this.layoutResID = layoutResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          DrawerItemHolder drawerHolder;
          View view = convertView;
          if (view == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                drawerHolder = new DrawerItemHolder();

                view = inflater.inflate(layoutResID, parent, false);
                drawerHolder.ItemName = (TextView) view.findViewById(R.id.drawer_name);
                drawerHolder.icon = (ImageView) view.findViewById(R.id.drawer_icon);

                view.setTag(drawerHolder);

          } else {
                drawerHolder = (DrawerItemHolder) view.getTag();
          }

          DrawerItem dItem = (DrawerItem) this.drawerItemList.get(position);

          drawerHolder.icon.setImageDrawable(view.getResources().getDrawable(dItem.getImgId()));
          drawerHolder.ItemName.setText(view.getResources().getString(dItem.getNameId()));

          return view;
    }
    
    private static class DrawerItemHolder {
          TextView ItemName;
          ImageView icon;
    }
}
