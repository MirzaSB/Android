package com.coreservlets.radiogroupactivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);

		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
		radioGroup.setOnCheckedChangeListener(new RadioGroupInfo());
	}
	
    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
	
    private class RadioGroupInfo implements OnCheckedChangeListener {
        private RadioButton mLastChecked; // Null: assumes you did not specify an initial selection in the layout file
        private String mNewSelectionMessageTemplate;
        private String mChangedSelectionMessageTemplate;
        
        public RadioGroupInfo() {
            mNewSelectionMessageTemplate = getString(R.string.new_selection_message_template);
            mChangedSelectionMessageTemplate = getString(R.string.changed_selection_message_template);
        }
        
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            RadioButton newChecked = (RadioButton)findViewById(checkedId);
            String message;
            if (mLastChecked == null) {  // No previous selection
                message = String.format(mNewSelectionMessageTemplate, 
                                        newChecked.getText());
            } else {
                message = String.format(mChangedSelectionMessageTemplate, 
                                        newChecked.getText(), 
                                        mLastChecked.getText());
            }
            mLastChecked = newChecked;
            showToast(message);
        }
    }

}
