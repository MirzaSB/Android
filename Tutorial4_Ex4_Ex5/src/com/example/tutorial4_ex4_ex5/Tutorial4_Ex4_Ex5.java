package com.example.tutorial4_ex4_ex5;

//Import Android libraries
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//Import Java Random library
import java.util.Random;

/** 
 * Create a class that would implement a simple layout. When one of the buttons is tapped, then the color of the button should change color. 
 */

public class Tutorial4_Ex4_Ex5 extends Activity {
	
	//Create an array that would store all appropriate colors
	private int[] aColors = {Color.RED, Color.BLUE, Color.YELLOW};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /**
     * This method changes the color of the button once its tapped. 
     */
    public void setColorToButton(View clickedButton) {
    	
    	//Initialize a new random number
    	Random iRandom = new Random();
    	//Generate a random index number based on the number of elements in the Colors array 
    	int i = iRandom.nextInt(aColors.length);
    	//Set the color of the button based on the random number chosen in the above index
    	clickedButton.setBackgroundColor(aColors[i]);
    	
    }
}