package com.coreservlets.spinneractivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpinnerActivity extends Activity {
	
	private String mItemSelectedMessageTemplate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinners);
		
		//Get the first selected item from a combo box
		mItemSelectedMessageTemplate = getString(R.string.spinner_message_template);
		
		//Initialize and configure the first spinner (Current Android Vendors)
		Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new SpinnerInfo());
		
		//Initialize and get the spinner
		Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
		//Create an array adapter
        List<String> futureAndroidVendors = getFutureAndroidVendors();
        ArrayAdapter<String> spinner2Adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, futureAndroidVendors);
        //Set value of View Resource as "simple_spinner_dropdown_item" which is a pre-defined entry in an Android distribution
        spinner2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinner2Adapter);
        spinner2.setOnItemSelectedListener(new SpinnerInfo());
	}
	
	//Create a private method to show a toast (essentially a push notification that shows what entry has been selected in a combo box)
	private void showToast(String text) {
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
	
    /** Returns a slightly randomized List of names.
     *  You can pass either a String[] or a List<String> to the ArrayAdapter<String> constructor.
     *  Here I convert an array to a List so that I can randomize the order of the elements, in
     *  order to demonstrate that Java can dynamically compute the elements to display in a Spinner.
     *  If you have fixed elements, use XML instead of Java, as in the first Spinner example.
     */
    private List<String> getFutureAndroidVendors() {
        String[] vendorArray = { "Apple", "RIM", "Palm", "Microsoft" };
        List<String> vendorList = Arrays.asList(vendorArray);
        //Randomize the order of elements
        Collections.shuffle(vendorList);
        return(vendorList);
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
			
			//Don;t want the Toast when the screen is first displayed, so ignore the first call to onItemSelected. Other calls are due to user interaction
			if (isFirst) {
				isFirst = false;
			}
			
			else {
				String selection = spinner.getItemAtPosition(selectedIndex).toString();
				String message = String.format(mItemSelectedMessageTemplate, selection);
				showToast(message);
			}
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> spinner) {
			// Won't be invoked unless you programmatically remove entries
			
		}
		
	}

}
