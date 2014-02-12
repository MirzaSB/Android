package com.coreservlets.tutorial8_excercises;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;

/**
 * Developer: Mirza Shiraz Baig
 * Created Date: 2-8-2014
 * Description: This app is the solution of Tutorial 8's third excercise. The second excercise's question is below:
 * 				In the previous example, make the foreground colors of the first three buttons be 
				different colors. Take these colors from a color file. Make the background color of the 
				TextView also be from the color file.
 * Revision History:
 */

public class Tutorial8_Ex3 extends Activity {
	
	//Declare a variable for the TextView.
	private View mColorRegion;
	
	//Declare variable for the currently tapped button
	private Button mButton;
	
	//Declare variable for the color
	private String mColor;
	
	//Initializes the app.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial8_ex3);
		
		//Get the TextView based on ID located in buttons.xml.
		mColorRegion = findViewById(R.id.color_region);
		
	}
	
	public void setRegionColor(View clickedButton) {
		
		//Assign the button object by casting it from the View
		mButton = (Button) clickedButton;
			
		//Create a series of conditionals, and assign the "mColor" variable from the colors.xml file
		if (mButton.getText().equals("Color 1")) {
			mColor =  getString(R.color.color_red);
		}
		else if (mButton.getText().equals("Color 2")) {
			mColor =  getString(R.color.color_yellow);
		}
		else if (mButton.getText().equals("Color 3")) {
			mColor =  getString(R.color.color_blue);
		}
		else if (mButton.getText().equals("Clear")) {
			mColor =  getString(R.color.color_black);
		}
		else {
			new AlertDialog.Builder(this).setTitle("Argh").setMessage("Color does not exist!! Click on something else. " + mColor + " " + mButton.getText().toString()).setNegativeButton("Cancel", null).setPositiveButton("OK", null).setNeutralButton("No", null).show(); 
		}
		
		//Once the color has been found from the xml file, change the background color of the TextView object.
		mColorRegion.setBackgroundColor(Color.parseColor(mColor));

	}
	
}