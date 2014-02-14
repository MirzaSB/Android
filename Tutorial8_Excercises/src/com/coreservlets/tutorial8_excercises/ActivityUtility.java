package com.coreservlets.tutorial8_excercises;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Developer: Mirza S. Baig
 * Created Date: 1-25-2014
 * Description: This class is used to switch to another Java class's activity. Intent can carry a collection of various data types as key-value pairs called extras. 
 * 				The idea is to call the "startActivity()" method, and pass it in the "Intent".
 * Revision History: 
 * 
 */

public class ActivityUtility {
	
    //Switches to the given class (which must be a subclass of Activity). 
	public static void goToActivity(Context currentActivity, Class<? extends Activity> newClass) {
		
		Intent newActivity = new Intent(currentActivity, newClass);
		currentActivity.startActivity(newActivity);
	}

}
