package com.packtpub.deliverydroid;

import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import android.view.LayoutInflater;

class BurgerAdapter extends BaseAdapter {
	private final Burger[] burgers;
	
	BurgerAdapter(Burger... burgers) {
		this.burgers = burgers;
	}
	
	public int getCount () {
		return burgers.length;
	}
	
	public Object getItem (int position) {
		return burgers[position];
	}
	
	public long getItemId (int position) {
		return position;
	}
	
	private ViewGroup getViewGroup(View reuse, ViewGroup parent) {
		if (reuse instanceof ViewGroup) {
			return (ViewGroup) reuse;
		}
		
		Context context = parent.getContext();
		LayoutInflater inflater = LayoutInflater.from(context);
		ViewGroup item = (ViewGroup) inflater.inflate(R.layout.burger_item, null);
		
		return item;
	}
	
	public View getView (int position, View convertView, ViewGroup parent) {
		ViewGroup item = getViewGroup(convertView, parent);
		
		TextView counter = (TextView) item.findViewById(R.id.counter);
		TextView label = (TextView) item.findViewById(R.id.text);
		
		Burger burger = burgers[position];
		
		counter.setVisibility(burger.count == 0 ? View.INVISIBLE : View.VISIBLE);
		counter.setText(Integer.toString(burger.count));
		label.setText(burger.name);
		
		return item;
	}
	
}