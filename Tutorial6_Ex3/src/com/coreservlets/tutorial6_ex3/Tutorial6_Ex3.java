package com.coreservlets.tutorial6_ex3;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.view.View;
import android.widget.ToggleButton;

/**
 * Add a row with three ToggleButtons. Have the labels be Red/Not Red, Yellow/Not Yellow, and Blue/Not Blue. Turn the TextView the appropriate color when the ToggleButton is clicked. For “Not Whatever”, use black.
 * This is a solution of Question 3 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/buttons-and-similar-widgets.pdf
 * @author MBaig
 * Completed on 07/26/2013.
 * Tested on Droid 2 Global phone (Android 2.3.4, Gingerbread), Samsung Galaxy 10.1 Tablet (Android OS 3.1, Honeycomb), and Google Nexus 7 (Android OS 4.2, Jellybean).
 */ 

public class Tutorial6_Ex3 extends Activity {
	
	//Declare a variable for the TextView.
	private View mColorRegion;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		//Get the TextView based on ID located in buttons.xml.
		mColorRegion = findViewById(R.id.color_region);
	}
	
	//Create a method that would change the color of the TextView to RED.
	public void setRedColor(View clickedImageButton) {
		setRegionColor(Color.RED);
	}
	
	//Create a method that would change the color of the TextView to BLUE.
	public void setBlueColor(View clickedButton) {
		setRegionColor(Color.BLUE);
	}
	
	//Create a method that would change the color of the TextView to YELLOW.
	public void setYellowColor(View clickedButton) {
		setRegionColor(Color.YELLOW);
	}
	
	//Create a method that would change the color of the TextView to BLACK [For all "Not Whatever" ToggleButtons].
	public void setBlackColor(View clickedButton) {
		setRegionColor(Color.BLACK);
	}
	
	//Create a method that would set the color of a TextView region.
	private void setRegionColor(int color) {
		mColorRegion.setBackgroundColor(color);
	}
	
	//Create a method that would handle ToggleButton behavior.
	public void showToggleButtonColor(View clickedToggleButton) {
		
		//Initialize a toggle button.
		ToggleButton toggleButton = (ToggleButton) clickedToggleButton;
		
		//If the toggle button is checked...
		if(toggleButton.isChecked()) {
			
			//If the "Red" toggle button is pressed, set the TextView color to RED.
			if (toggleButton.getText().toString().equalsIgnoreCase("red")) {
				setRedColor(clickedToggleButton);
			}
			//If the "Blue" toggle button is pressed, set the TextView color to BLUE.
			else if (toggleButton.getText().toString().equalsIgnoreCase("blue")) {
				setBlueColor(clickedToggleButton);
			}
			//If the "Yellow" toggle button is pressed, set the TextView color to YELLOW.
			else if (toggleButton.getText().toString().equalsIgnoreCase("yellow")) {
				setYellowColor(clickedToggleButton);
			}
			//If the color label on the toggle button is not defined correctly, then throw out an alert pop-up box.
			else {
				new AlertDialog.Builder(this).setTitle("Argh").setMessage("Color does not exist!! Click on something else.").setNegativeButton("Cancel", null).setPositiveButton("OK", null).setNeutralButton("No", null).show();  

			}
		}
		//If any of the toggle buttons are unchecked, then change the TextView color to BLACK.
		else {
			setBlackColor(clickedToggleButton);
		}
	}

}
