package com.coreservlets.checkboxactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CheckboxActivity extends Activity {

	private String mButtonMessageTemplate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		mButtonMessageTemplate = getString(R.string.button_message_template);
	}
	
    public void showButtonText(View clickedButton) { 
        Button button = (Button)clickedButton;
        CharSequence text = button.getText();
        String message =
                String.format(mButtonMessageTemplate, text);
        showToast(message);
    }
	
    /** Creates a "Toast" (temporary popup message) that displays the designated text. */
    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
