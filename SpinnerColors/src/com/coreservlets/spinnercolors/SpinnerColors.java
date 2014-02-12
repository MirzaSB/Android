package com.coreservlets.spinnercolors;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.Arrays;
import java.util.List;

/*
 * Make a project with a Spinner that displays the choices Red, Yellow, Blue, and Green. Have a TextView whose color matches the Spinner. Set the choices in XML.
 * Add a second Spinner with the same choices and behavior as above. But, this time, set the choices from Java. If you want to have a prompt (i.e., title at the top when the spinner pops 
	up, use yourSpinner.setPrompt and supply either an id or a String).
 *	Author: Mirza S. Baig
 *  Date: 9/29/2013
 *  Tested on Sony Xperia tablet (Android OS Ice cream Sandwich) and Android Gingerbread emulator. Passed successfully.
 */

public class SpinnerColors extends Activity {

	private String mItemSelectedMessageTemplate;
	
	//Declare a variable for the TextView
	private View mColorRegion;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinners);
		
		//Get the TextView based on ID located in buttons.xml.
		mColorRegion = findViewById(R.id.color_region);
		
		//Get the first selected item from a combo box
		mItemSelectedMessageTemplate = getString(R.string.spinner_message_template);
		
		//Initialize and configure the first spinner
		Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new SpinnerInfo());
		
		//Initialize and configure the second spinner
		Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
		//Create an array adapter
		List<String> spinColors = getColors();
		ArrayAdapter<String> spinner2Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinColors);
		//Set the value of View Resource as "simple_spinner_dropdown_item" which is a pre-defined entry in an Android distribution
		spinner2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(spinner2Adapter);
		//Set the prompt for the second combo box
		spinner2.setPrompt("Choose Color (Choices from Java)");
		spinner2.setOnItemSelectedListener(new SpinnerInfo());
	}
	
	//Returns a list of colors
	private List<String> getColors() {
		String[] colorArray = {"White", "Red", "Yellow", "Blue", "Green"};
		List<String> colorList = Arrays.asList(colorArray);
		return (colorList);
	}
	
	//Create a private method to show a toast (essentially a push notification that shows what entry has been selected in a combo box)
	private void showToast(String text) {
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
	
	//Create a method that would set the color of a TextView region.
	private void setRegionColor(int color) {
		mColorRegion.setBackgroundColor(color);
	}
    
    /*Implement a SpinnerInfo class that would further implement OnItemSelectedListener with respect to our combo boxes.
     * This listener is invoked when an entry is selected in a combo box. Invoked once when Spinner is first displayed, and then again for each time the user selects something.
     */
	private class SpinnerInfo implements OnItemSelectedListener {
		private boolean isFirst = true;

		@Override
		/*
		 * Arguments Description of this method:
		 * @param spinner: The spinner itself.
		 * @param View: The row of the Spinner that was selected.
		 * @param selectedIndex: The index of the selection. Used in conjunction with "getItemAtPosition" method to get the text of the selection.
		 * @param id: The row id of the selected item.
		 */
		public void onItemSelected(AdapterView<?> spinner, View selectedView, int selectedIndex,
				long id) {
			
			//Don't want the Toast when the screen is first displayed, so ignore the first call to onItemSelected. Other calls are due to user interaction
			if (isFirst) {
				isFirst = false;
			}
			
			else {
				//Get the color selected from the string array located in strings.xml
				String selection = spinner.getItemAtPosition(selectedIndex).toString();
				//Create a toast message
				String message = String.format(mItemSelectedMessageTemplate, selection);
				//Parse the selected string into an int color value and pass it into the setRegionColor method. For example, if "Red" is selected, 
				//then it parses it and gets "Color.RED" and passes it into the "SetRegionColor" method. 
				setRegionColor(Color.parseColor(selection));
				showToast(message);
			}
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> spinner) {
			// Won't be invoked unless you remove entries via code
			
		}
		
	}

}
