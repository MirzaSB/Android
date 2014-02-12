package com.coreservlets.imagebuttonactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class ImageButtonActivity extends Activity {

	private String mImageButtonMessageTemplate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		mImageButtonMessageTemplate = getString(R.string.image_button_message_template);
	}

	public void showImageButton1Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_1_image);
	}
	
	public void showImageButton2Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_2_image);
	}
	
	public void showImageButton3Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_3_image);
	}
	
	private void showImageButtonInfo(int imageId) {
		String image = getString(imageId);
		String message = String.format(mImageButtonMessageTemplate, image);
		showToast(message);
	}
	
    /** Creates a "Toast" (temporary popup message) that displays the designated text. */
    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

}
