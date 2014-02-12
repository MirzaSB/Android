package com.coreservlets.togglebuttonactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends Activity {
	
	private String mToggleButtonMessageTemplate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		mToggleButtonMessageTemplate = getString(R.string.toggle_button_message_template);
	}
	
    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

	public void showToggleButtonInfo(View clickedToggleButton) {
		ToggleButton toggleButton = (ToggleButton) clickedToggleButton;
		String status;
		if(toggleButton.isChecked()) {
			status = "ON";
		}
		else {
			status = "OFF";
		}
		CharSequence label = toggleButton.getText();
		String message = String.format(mToggleButtonMessageTemplate, status, label);
		showToast(message);
	}

}
