package com.packtpub.deliverydroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.view.View;
import android.app.ListActivity;
import android.os.Bundle;
import android.content.Intent;
import com.packtpub.deliverydroid.MicksPizzaActivity;

public class SelectRestaurantActivitiv extends Activity implements OnItemClickListener
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

 		ListView restaurants = (ListView) findViewById(R.id.restaurant);
 		restaurants.setAdapter(new ArrayAdapter<String>(
			this,
			R.layout.menu_item,
			getResources().getStringArray(R.array.restaurants)));
		
		restaurants.setOnItemClickListener(this);
	
	}

	public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
		switch (position) {
			case 0: 
				startActivity(new Intent(this, TheBurgerPlaceActivity.class));
				break;
			case 1:
				startActivity(new Intent(this, MicksPizzaActivity.class));
				break;
			case 2:
				startActivity(new Intent(this, FourBucketsActivity.class));
				break;
		}
	}

}
