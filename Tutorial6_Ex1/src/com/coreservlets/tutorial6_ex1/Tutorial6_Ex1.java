package com.coreservlets.tutorial6_ex1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

/**
 * Make a row containing two ImageButtons. Put a blank TextView at the bottom. Have the first image be red, and have it turn the TextView red when you click it. Have the second image be blue, and have it turn the 
 * TextView blue when you click it. Use a single image file for each ImageButton. To change the color, use the TextView’s setBackgroundColor method with arguments of Color.RED and Color.BLUE.
 * This is a solution of Question 1 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/buttons-and-similar-widgets.pdf
 * @author MBaig
 * Completed on 07/22/2013.
 * Tested on Droid 2 Global phone.
 */ 

public class Tutorial6_Ex1 extends Activity {
	
	//Declare a variable for the TextView
	private View mColorRegion;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		//Get the TextView based on ID located in buttons.xml
		mColorRegion = findViewById(R.id.color_region);
	}
	
	//Create a method that would change the color of the TextView to RED once the red button is tapped
	public void showImageButton1Color(View clickedImageButton) {
		setRegionColor(Color.RED);
	}
	
	//Create a method that would change the color of the TextView to BLUE once the blue button is tapped
	public void showImageButton2Color(View clickedImageButton) {
		setRegionColor(Color.BLUE);
	}
	
	//Create a method that would set the color of a TextView region
	private void setRegionColor(int color) {
		mColorRegion.setBackgroundColor(color);
	}

}