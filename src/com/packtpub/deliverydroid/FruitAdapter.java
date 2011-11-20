package com.packtpub.deliverydroid;

import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;
import android.view.LayoutInflater;

class FruitAdapter extends BaseAdapter {
	FruitItem[] items;
	
	public FruitAdapter(FruitItem... items) {
		this.items = items;
	}
	
	public View getView (int position, View convertView, ViewGroup parent) {
		FruitItem item = items[position];
		
		ViewGroup view = getViewGroup(convertView, parent);
		
		TextView text = ((TextView) view.findViewById(R.id.text));
		ImageView image = ((ImageView) view.findViewById(R.id.icon));
		
		text.setText(item.name);
		image.setImageResource(item.image);
		
		return view;
	}
	
	public int getCount () {
		return items.length;
	}
	
	public Object getItem (int position) {
		return items[position];
	}
	
	public long getItemId (int position) {
		return position;
	}


    private ViewGroup getViewGroup(
            final View reuse,
            final ViewGroup parent) {

        if(reuse instanceof ViewGroup) {
            return (ViewGroup)reuse;
        } else {
            final Context context = parent.getContext();
            final LayoutInflater inflater = LayoutInflater.from(context);

            final ViewGroup item = (ViewGroup)inflater.inflate(
                    R.layout.fruit_item,
                    null);

            return item;
        }
    }
	
}