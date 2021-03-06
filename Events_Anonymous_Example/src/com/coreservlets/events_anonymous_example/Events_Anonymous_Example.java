package com.coreservlets.events_anonymous_example;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Events_Anonymous_Example extends Activity {
	
	private View mColorRegion;
	private int[] mColorChoices = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.RED, Color.TRANSPARENT };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mColorRegion = findViewById(R.id.color_region);
		Button colorButton = (Button) findViewById(R.id.color_button);
		colorButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Random generator = new Random();
				int index = generator.nextInt(mColorChoices.length);
				setRegionColor(mColorChoices[index]);
					
			}
				
		});
	}

	private void setRegionColor(int color) {
		mColorRegion.setBackgroundColor(color);
	}
	


}
