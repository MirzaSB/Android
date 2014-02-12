package com.coreservlets.tutorial4_ex6;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/** 
 * Create an initial Activity
 */

public class Tutorial4_Ex6 extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Get the text view label from main.xml
        final TextView tv = (TextView) findViewById(R.id.textView1);
        
        //Get the "Push Me!" button value based on ID from main.xml
        final Button pbutton = (Button) findViewById(R.id.pushButton);
        //Create a listener that would wait for the user to tap on "Push Me!" button
        pbutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		//Change the text color of the Text View in the app
        		tv.setTextColor(Color.GREEN);
        	}
        });
        
        //Get the "Click Me!" button value based on ID from main.xml
        final Button cbutton = (Button) findViewById(R.id.clickButton);
        //Create a listener that would wait for the user to tap on "Click Me!" button
        cbutton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		//Change the text color of the Text View in the app
        		tv.setTextColor(Color.MAGENTA);
        	}
        });
        
    }
    
}