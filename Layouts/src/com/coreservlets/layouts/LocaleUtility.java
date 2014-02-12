package com.coreservlets.layouts;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/**
 * Developer: Mirza Shiraz Baig
 * Created Date: 1-4-2014
 * Description: This class changes the Locale programmatically.
 * Revision History: 
 */
public class LocaleUtility {
	
	//Sets the Locale to the given Locale name like "es",  etc.
	public static void setLocale(Context context, String localeName) {
		setLocale(context, new Locale(localeName));
	}
	
	//Sets the Locale to the given Locale object.
	public static void setLocale(Context context, Locale locale) {
		Locale.setDefault(locale);
		Configuration config = new Configuration();
		config.locale = locale;
		context.getResources().updateConfiguration(config, null);
	}
	
}
