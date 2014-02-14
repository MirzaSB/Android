package com.coreservlets.tutorial8_excercises;

import android.os.Bundle;
import android.app.Activity;

/**
 * Developer: Mirza S. Baig
 * Created Date: 2-3-2014
 * Description: This app is the solution of Tutorial 8's second excercise. The second excercise's question is below:
 * 				Make a screen with a row of 3 buttons (“Color 1”, “Color 2”, and “Color 3”) across the top. Make the third button
 * 				fill up any leftover space. The next row should be a Text-View that takes up the full width and has a fixed height. 
 * 				The third row should contain a single button (“Clear”) at the far right. Again, you can give behavior to the buttons if you want,
 * 				but for the purposes of this exercise, the important part is the layout.
 * Revision History:
 */
public class Tutorial8_Ex2 extends Activity {
	
	//Initializes the app.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial8_ex2);
		
	}
	
}