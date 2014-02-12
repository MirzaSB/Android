package com.coreservlets.tutorial8_excercises;

import android.view.View;
import android.app.Activity;
import android.os.Bundle;

/**
 * Developer: Mirza Shiraz Baig
 * Created Date: 1-25-2014
 * Description: This class is used as an a preliminary path that would take the user to the 4 solution apps of the "Layouts" section. 
 * Revision History: 
 */

public class LayoutsInitialActivity extends Activity {
	
	//Initializes the app upon creation
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	//Switch to the "Tutorial8_Ex1" activity
	public void Tutorial8_Ex1(View clickedButton) {
		ActivityUtility.goToActivity(this, Tutorial8_Ex1.class);
	}
	
	
	//Switch to the "Tutorial8_Ex2" activity
	public void Tutorial8_Ex2(View clickedButton) {
		ActivityUtility.goToActivity(this, Tutorial8_Ex2.class);
	}
	
	//Switch to the "Tutorial8_Ex3" activity
	public void Tutorial8_Ex3(View clickedButton) {
		ActivityUtility.goToActivity(this, Tutorial8_Ex3.class);
	}
	
	/*
	//Switch to the "Tutorial8_Ex4" activity
	public void Tutorial8_Ex4(View clickedButton) {
		//ActivityUtility.goToActivity(this, Tutorial8_Ex4.class);
	}
*/
}
