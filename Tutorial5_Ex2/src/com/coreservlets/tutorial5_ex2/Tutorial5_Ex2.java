package com.coreservlets.tutorial5_ex2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

/**
 * Make an app with two buttons. Have the first one pop up a Toast that says "Hello". Have the secibd ibe say "Goodbye". Use the seperate class approach.
 * This is a solution of Question 2 from http://courses.coreservlets.com/Course-Materials/pdf/android/exercises/widget-event-handling.pdf
 * @author MBaig
 * Completed on 06/21/2013.
 * Tested on Droid 2 Global phone.

 */ 

public class Tutorial5_Ex2 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		//Call this before findViewbyId
		setContentView(R.layout.main);
		
		//Initialize the buttons from main.xml.
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		
		//Get the messages from strings.xml
		String sHello = getString(R.string.hello);
		String sGoodbye = getString(R.string.goodbye);
		
		//Assign an inner class as the event handler for both the buttons. Pass arguments to the event handler so that the same event handler class has the ability to initiate the "Toast". 
		b1.setOnClickListener(new Toaster(sHello, this));
		b2.setOnClickListener(new Toaster(sGoodbye, this));
		
	}

}
