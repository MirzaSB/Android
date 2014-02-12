package com.coreservlets.layouts;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;

/**
 * Developer: Mirza Shiraz Baig
 * Created Date: 1-4-2014
 * Description: This class is used to show the usage of Nested Layouts.
 * Revision History: 
 */
public class NestedLayouts extends Activity {
	
	//Initializes the app.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nested_layouts);
	}
	
	//Switch to the "LayoutsInitialActivity" when the "Go to Initial Screen" button is tapped.
	public void showInitialScreen(View clickedButton) {
		ActivityUtility.goToActivity(this, LayoutsInitialActivity.class);
	}
	
	//Switch to the "LayoutWeights" activity when the "Go to Layout Weights Example" button is tapped.
    public void showLayoutWeights(View clickedButton) {
    	ActivityUtility.goToActivity(this, LayoutWeightsActivity.class);
    }
}
