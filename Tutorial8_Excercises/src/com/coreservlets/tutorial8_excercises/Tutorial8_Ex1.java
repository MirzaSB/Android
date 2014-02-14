package com.coreservlets.tutorial8_excercises;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.app.Activity;
import android.graphics.Color;

/**
 * Developer: Mirza S. Baig
 * Created Date: 1-25-2014
 * Description: This app is the solution of Tutorial 8's first excercise. The first excercise's question is below:
 * 				Make a screen that has a row of centered Radio buttons (Red, Green, Blue, White with Red initially selected), a right aligned row of buttons next 
 * 				("Set Color" and "Clear"), and an initially white TextView at the bottom. Add behavior to the buttons so that the "Set Color" button sets the background color of the
 * 				TextView, and the "Clear" button makes the TextView black.
 * Revision History:
 * 	2-1-2014 | Mirza | Rehauled the entire app.
 *  2-1-2014 | Mirza | Fixed defects that would crash the app as soon as a button is tapped.
 *  2-1-2014 | Mirza | Added support for a default radio button being selected upon app initialization.
 *  2-1-2014 | Mirza | Completed testing the app on the Nexus 4 (Using Android 4.2.2) device.
 */
public class Tutorial8_Ex1 extends Activity {
	
	//Declare a variable for the TextView.
	private View mColorRegion;
	
	//Declare a variable for the RadioGroup.
	private RadioGroup mRadioGroup;
	
	//Initializes the app.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial8_ex1);
		
		//Get the TextView based on ID located in buttons.xml.
		mColorRegion = findViewById(R.id.color_region);
		
		//Get the reference to the Radio Group object.
		mRadioGroup = (RadioGroup) findViewById(R.id.group1);
		
	}
	
	//Create a method that would set the color of a TextView region.
	private void setRegionColor(int color) {
		mColorRegion.setBackgroundColor(color);
	}
	
	//Create a method that would change the color of the TextView to RED.
	public void setRedColor(View clickedButton) {
		setRegionColor(Color.RED);
	}
	
	//Create a method that would change the color of the TextView to BLUE.
	public void setBlueColor(View clickedButton) {
		setRegionColor(Color.BLUE);
	}
	
	//Create a method that would change the color of the TextView to WHITE.
	public void setWhiteColor(View clickedButton) {
		setRegionColor(Color.WHITE);
	}
	
	//Create a method that would change the color of the TextView to BLACK. This is primarily used when the user taps on the "Clear" button.
	public void setBlackColor(View clickedButton) {
		setRegionColor(Color.BLACK);
	}
	
	//Create a method that would change the color of the TextView to GREEN.
	public void setGreenColor(View clickedButton) {
		setRegionColor(Color.GREEN);
	}
	
	public void setViewColor(View clickedButton) {
		
		//Get the integer which represents the selected radio button's ID
		int iRadioButtonId = mRadioGroup.getCheckedRadioButtonId();
		
		//Create a switch statement that would change the color of the TextView based on what Radio Button was selected, and when the user taps on the "Set Color" button.
        switch(iRadioButtonId) {
        	case R.id.red: 
        		setRedColor(clickedButton); 
        		break;
        	case R.id.blue: 
        		setBlueColor(clickedButton); 
        		break;
        	case R.id.white: 
        		setWhiteColor(clickedButton); 
        		break;
        	case R.id.green: 
        		setGreenColor(clickedButton); 
        		break;
        	default: 
        		setBlackColor(clickedButton);
        }
		
	}
	
}