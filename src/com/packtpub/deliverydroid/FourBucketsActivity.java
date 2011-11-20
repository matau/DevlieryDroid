package com.packtpub.deliverydroid;

import android.view.LayoutInflater;
import android.widget.GridView;
import android.app.Activity;
import android.os.Bundle;

public class FourBucketsActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		
		LayoutInflater inflater = getLayoutInflater();
		GridView view = (GridView) inflater.inflate(R.layout.four_buckets, null);
		view.setAdapter(new FruitAdapter(
			new FruitItem("Apple", R.drawable.apple),
			new FruitItem("Banana", R.drawable.banana),
			new FruitItem("Black Berries", R.drawable.blackberry),
			new FruitItem("Cherries", R.drawable.cherries),
			new FruitItem("Coconut", R.drawable.coconut),
			new FruitItem("Grapes", R.drawable.grapes),
			new FruitItem("Kiwi", R.drawable.kiwi),
			new FruitItem("Orange", R.drawable.orange),
			new FruitItem("Peach", R.drawable.peach),
			new FruitItem("Lemon", R.drawable.lemon),
			new FruitItem("Strawberry", R.drawable.strawberry),
			new FruitItem("Watermelon", R.drawable.watermelon)
			));
			
		setContentView(view);
	}
}