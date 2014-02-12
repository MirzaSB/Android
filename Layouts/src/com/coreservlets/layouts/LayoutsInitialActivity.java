package com.coreservlets.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


/**
 * Developer: Mirza Shiraz Baig
 * Created Date: 1-4-2014
 * Description: This class is used to show different types of layouts; Nested, Layout Weights, Table.
 * Revision History: 
 * 01-12-2014 | Mirza Shiraz Baig | Added code for the Relative Layouts functionality.
 * 01-14-2014 | Mirza Shiraz Baig | Added code for the Table Layouts functionality.
 */
public class LayoutsInitialActivity extends Activity {
	
	//Initializes the app when upon creation.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	//Switch to the "NestedLayouts" activity when the "Nested Layouts (Colored Layouts)" button is tapped.
	public void showNestedLayouts(View clickedButton) {
		setEnglishLocale();
		ActivityUtility.goToActivity(this, NestedLayouts.class);
	}
	
	//Set the locale to default i,e with colors.
    private void setEnglishLocale() {
        LocaleUtility.setLocale(this, "en");
    }
	
	//Switch to the "NestedLayouts" activity when the "Nested Layouts (No Colors)" button is tapped.
	public void showNestedLayoutsNoColors(View clickedButton) {
		//Set the locale to use no colors i,e "values-qq" directory.
		LocaleUtility.setLocale(this, "qq");
		ActivityUtility.goToActivity(this, NestedLayouts.class);
	}
	
	//Switch to the "LayoutWeights" activity when the "Using Layout Weights" button is tapped.
	public void showLayoutWeights(View clickedButton) {
		ActivityUtility.goToActivity(this, LayoutWeightsActivity.class);
	}
	
	//Switch to the "RelativeLayoutsActivity" activity when the "Relative Layouts" button is tapped.
	public void showRelativeLayouts(View clickedButton) {
		ActivityUtility.goToActivity(this, RelativeLayoutsActivity.class);
	}
	
	//Switch to the "TableLayoutsActivity" activity when the "Table Layouts" button is tapped.
	public void showTableLayouts(View clickedButton) {
		ActivityUtility.goToActivity(this, TableLayoutsActivity.class);
	}
}
