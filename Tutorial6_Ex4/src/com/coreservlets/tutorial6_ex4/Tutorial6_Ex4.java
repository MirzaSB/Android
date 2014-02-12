package com.coreservlets.tutorial6_ex4;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

/**
 * Question 1 --> Make a row containing two ImageButtons. Put a blank TextView at the bottom. Have the first image be red, and have it turn the TextView red when you click it. Have the second image be blue, and have it turn the TextView blue when you click it. Use a single image file for each ImageButton. For some red and blue images, try http://findicons.com/search/red and http://findicons.com/search/blue. Or, steal the icons out of my exercise solutions folder (ButtonsExercises). To change the color, use the TextView’s setBackgroundColor method with arguments of Color.RED and Color.BLUE.
 * Question 2 --> Add a row with three RadioButtons with labels Red, Yellow, and Blue. Have them turn the TextView at the bottom the appropriate color. 
 * Question 3 --> Add a row with three ToggleButtons. Have the labels be Red/Not Red, Yellow/Not Yellow, and Blue/Not Blue. Turn the TextView the appropriate color when the ToggleButton is clicked. For “Not Whatever”, use black.
 * Question 4 --> Add another row of RadioButtons with the same labels as in problem 2. But this time, take no action when the RadioButtons are clicked. Instead, put a Button underneath that says “Set Color Chosen Above”. Change the color when that Button is clicked. Hint: RadioGroup has a getCheckedRadioButtonId method. Note that this is not the index (0 for the 
first radio button, 1 for the second, etc.). Instead it is an int representing the id (i.e., the id as defined via android:id in the XML). So, you have to do a “switch” or “if” comparing the ids (R.id.red_radio_button, R.id.blue_radio_button, etc.).
 * This is a solution of Questions 1 to Question 4 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/buttons-and-similar-widgets.pdf in an integrated build.
 * @author MBaig
 * Completed on 07/26/2013.
 * Tested on Droid 2 Global phone (Android 2.3.4, Gingerbread), Samsung Galaxy 10.1 Tablet (Android OS 3.1, Honeycomb), and Google Nexus 7 (Android OS 4.2, Jellybean).
 */ 

public class Tutorial6_Ex4 extends Activity {
	
	//Declare a variable for the TextView.
	private View mColorRegion;
	
	//Declare a variable for the RadioGroup
	private RadioGroup mRadioGroup;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		//Get the TextView based on ID located in buttons.xml.
		mColorRegion = findViewById(R.id.color_region);
		//Get the RadioGroup based on ID located in buttons.xml
		mRadioGroup = (RadioGroup)findViewById(R.id.radio_group);
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
	
	//Create a method that would set the color of the TextView based on what RadioButton was selected when the user taps on the "Set Color Chosen Above" button.
	public void setColorChosenByRadioGroup(View clickedButton) {
		//Get the ID of the Radio Button selected from the Radio Group.
		int iRadioButtonId = mRadioGroup.getCheckedRadioButtonId();
		//Create a switch statement that would change the color of the TextView based on what Radio Button was selected, and as soon as the user clicks on the "Set Color Chosen Above" button.
        switch(iRadioButtonId) {
        	case R.id.red_radio_button: 
        		setRedColor(clickedButton); 
        		break;
        	case R.id.blue_radio_button: 
        		setBlueColor(clickedButton); ; 
        		break;
        	case R.id.yellow_radio_button: 
        		setYellowColor(clickedButton); ; 
        		break;
        	default: 
        		setBlackColor(clickedButton); ;
        }
		
	}

}
