package com.example.tutorial5_ex1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Make an app with two buttons. Have the first one pop up a Toast that says "Hello". Have the secibd ibe say "Goodbye". Use the named inner class approach.
 * This is a solution of Question 1 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/widget-event-handling.pdf
 * @author MBaig
 * Completed on 06/18/2013.
 * Tested on Droid 2 Global phone.

 */ 

public class Tutorial5_Ex1 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//Initialize the buttons from main.xml.
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		
		//Assign an inner class as the event hanlder for both the buttons. Pass arguments to the event handler so that the same event handler class has the ability to initiate the "Toast". 
		b1.setOnClickListener(new Toaster("Hello"));
		b2.setOnClickListener(new Toaster("Goodbye"));
		
	}
	
	//This is the private method that will be called by the inner event class. 
	private void setToast(String text) {
		//Setup a "Toast" that will use the text returned from "Toaster" inner class for a short period of time.
		Toast tempMessage = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
		//Show the "Toast"/pop-up message once the button is clicked upon.
		tempMessage.show();
	}
	
	//This is the named inner class, "Toaster" that implements OnClickListener, and will create "Toasts"/pop-up messages once a button on the app is clicked. 
	private class Toaster implements OnClickListener {
		
		//Initialize private String. This will be used to determine which text will be sent to the private method, "setToast" which is part of the main activity.
		private String text;
		
		//Create constructor.
		public Toaster(String text) {
			//Set "this" text to what was passed in the listener (located in the main activity).
			this.text = text;
		}
		
		//This is the method that will directly call the appropriate method(s) in the main Activity, even if the method is private.
		public void onClick(View v) {
			
			//Check to see if the button's name is "Hello".
			if (((Button)v).getText().toString().equalsIgnoreCase("hello")) {
				//If the button's name is "Hello", then get the appropriate greeting/notification text from strings.xml.
				text = getString(R.string.hello);
			}
			//Check to see if the button's name is "Goodbye".
			else if (((Button)v).getText().toString().equalsIgnoreCase("goodbye")) {
				//If the button's name is "Goodbye", then get the appropriate greeting/notification text from strings.xml.
				text = getString(R.string.goodbye);
			}
			
			//Call the method in the main activity class.
			setToast(text);
		}
		
		
	}

}
