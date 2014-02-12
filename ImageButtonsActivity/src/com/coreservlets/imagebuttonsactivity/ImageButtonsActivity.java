package com.coreservlets.imagebuttonsactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class ImageButtonsActivity extends Activity {

	private String mImageButtonMessageTemplate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		mImageButtonMessageTemplate = getString(R.string.image_button_message_template);
	}

	public void showImageButton4Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_4_image);
	}
	
	public void showImageButton5Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_5_image);
	}
	
	public void showImageButton6Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_6_image);
	}
	
	private void showImageButtonInfo(int imageId) {
		String image = getString(imageId);
		String message = String.format(mImageButtonMessageTemplate, image);
		showToast(message);
	}
	
    /** Creates a "Toast" (temporary popup message) that displays the designated text. */
    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
