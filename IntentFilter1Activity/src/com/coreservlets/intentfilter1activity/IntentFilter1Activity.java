package com.coreservlets.intentfilter1activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntentFilter1Activity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void showLoanPayments1 (View clickedButton) {
		Intent activityIntent = new Intent(this, LoanCalculatorActivity.class);
		startActivity(activityIntent);
	}
	
	public void showLoanPayments2(View clickedButton) {
		Intent activityIntent = new Intent(this, LoanCalculatorActivity.class);
		activityIntent.putExtras(LoanBundler.makeRandomizedLoanInfoBundle());
		startActivity(activityIntent);
	}

}
