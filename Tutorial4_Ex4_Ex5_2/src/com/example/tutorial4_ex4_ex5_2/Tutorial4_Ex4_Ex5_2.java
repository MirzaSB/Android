package com.example.tutorial4_ex4_ex5_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/** 
 * Create an initial Activity
 */

public class Tutorial4_Ex4_Ex5_2 extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /**
     * Method to pop up a message when "Click Me!" button is tapped
     * @param clickedButton
     */
    public void showClickToast(View clickedButton) {
    	String sClickGreeting = getString(R.string.clickButton_greeting);
    	Toast tempMessage = Toast.makeText(this, sClickGreeting, Toast.LENGTH_SHORT);
    	tempMessage.show();
    }
    
    /**
     * Method to pop up a message when "Push Me!" button is tapped
     * @param clickedButton
     */
    public void showPushToast(View clickedButton) {
    	String sPushGreeting = getString(R.string.pushButton_greeting);
     	Toast tempMessage = Toast.makeText(this, sPushGreeting, Toast.LENGTH_SHORT);
    	tempMessage.show();
    }
    
}