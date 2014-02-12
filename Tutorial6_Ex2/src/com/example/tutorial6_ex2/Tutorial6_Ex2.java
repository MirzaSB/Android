package com.example.tutorial6_ex2;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

/**
 * Add a row with three RadioButtons with labels Red, Yellow, and Blue. Have them turn the TextView at the bottom the appropriate color.
 * This is a solution of Question 2 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/buttons-and-similar-widgets.pdf
 * @author MBaig
 * Completed on 07/25/2013.
 * Tested on Droid 2 Global phone (Android 2.3.4, Gingerbread) and Samsung Galaxy 10.1 Tablet (Android OS 3.1, Honeycomb).
 */ 

public class Tutorial6_Ex2 extends Activity {
	
	//Declare a variable for the TextView
	private View mColorRegion;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		//Get the TextView based on ID located in buttons.xml
		mColorRegion = findViewById(R.id.color_region);
	}
	
	//Create a method that would change the color of the TextView to RED
	public void setRedColor(View clickedImageButton) {
		setRegionColor(Color.RED);
	}
	
	//Create a method that would change the color of the TextView to BLUE
	public void setBlueColor(View clickedImageButton) {
		setRegionColor(Color.BLUE);
	}
	
	//Create a method that would change the color of the TextView to YELLOW
	public void setYellowColor(View clickedImageButton) {
		setRegionColor(Color.YELLOW);
	}
	
	//Create a method that would set the color of a TextView region
	private void setRegionColor(int color) {
		mColorRegion.setBackgroundColor(color);
	}

}
