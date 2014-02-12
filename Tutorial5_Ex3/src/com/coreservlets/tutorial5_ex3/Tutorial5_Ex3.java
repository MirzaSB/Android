package com.coreservlets.tutorial5_ex3;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

/**
 * Make an app with two buttons. Have the first one pop up a Toast that says "Hello". Have the second one say "Goodbye". Use the approach where the event handler methods are specified in the main.xml layout.
 * This is a solution of Question 1 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/widget-event-handling.pdf
 * @author MBaig
 * Completed on 06/21/2013.
 * Tested on Droid 2 Global phone.

 */ 

public class Tutorial5_Ex3 extends Activity {
	
	//Initialize the app when it is first created.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}
	
	//Method for creating a Toast/pop-up message when "Hello" button is tapped.
	public void Toaster_Hello(View v) {
		Toast tempMessage = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
		//Show the "Toast"/pop-up message once the button is clicked upon.
		tempMessage.show();
	}
	
	//Method for creating a Toast/pop-up message when "Goodbye" button is tapped.
	public void Toaster_Goodbye(View v) {
		Toast tempMessage = Toast.makeText(this, "Goodbye", Toast.LENGTH_SHORT);
		//Show the "Toast"/pop-up message once the button is clicked upon.
		tempMessage.show();
	}

}
