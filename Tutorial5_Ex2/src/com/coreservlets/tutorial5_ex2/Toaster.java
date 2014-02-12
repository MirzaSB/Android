package com.coreservlets.tutorial5_ex2;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

//This is the seperate class, "Toaster" that implements OnClickListener, and will create "Toasts"/pop-up messages once a button on the app is clicked. 
public class Toaster implements OnClickListener {
	
	//Initialize private String. This will be used to determine which text will be sent to the private method, "setToast" which is part of the main activity.
	private String text;
	
	//Initialize activity to be used in the main class.
	private Tutorial5_Ex2 mainActivity;
	
	//Create constructor.
	public Toaster(String text, Tutorial5_Ex2 mainActivity) {
		this.text = text;
		this.mainActivity = mainActivity;
	}
	
	//This is the method that will directly call the appropriate method(s) in the main Activity.
	public void onClick(View v) {
		
		Toast tempMessage = Toast.makeText(mainActivity, text, Toast.LENGTH_SHORT);
        tempMessage.show();
	}
	
}