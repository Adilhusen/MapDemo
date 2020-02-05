package com.app.tripdetails.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Pref {

	private static SharedPreferences sharedPreferences = null;

	public static void openPref(Context context) {

		try {
			sharedPreferences = context.getSharedPreferences("ProjectName",Context.MODE_PRIVATE);
		} catch (Exception e) {

		}
	}

	public static String getValue(Context context, String key,
								  String defaultValue) {
		Pref.openPref(context);
		String result = Pref.sharedPreferences.getString(key, defaultValue);
		Pref.sharedPreferences = null;
		return result;
	}

	public static void setValue(Context context, String key, String value) {
		Pref.openPref(context);
		Editor prefsPrivateEditor = Pref.sharedPreferences.edit();
		prefsPrivateEditor.putString(key, value);
		prefsPrivateEditor.commit();
		prefsPrivateEditor = null;
		Pref.sharedPreferences = null;
	}

	public static boolean getValueboolean(Context context, String key,
								  boolean defaultValue) {
		Pref.openPref(context);
		boolean result = Pref.sharedPreferences.getBoolean(key, defaultValue);
		Pref.sharedPreferences = null;
		return result;
	}

	public static void setValueboolean(Context context, String key, boolean value) {
		Pref.openPref(context);
		Editor prefsPrivateEditor = Pref.sharedPreferences.edit();
		prefsPrivateEditor.putBoolean(key, value);
		prefsPrivateEditor.commit();
		prefsPrivateEditor = null;
		Pref.sharedPreferences = null;
	}

	public static int getValueInt(Context context, String key,
										  int defaultValue) {
		Pref.openPref(context);
		int result = Pref.sharedPreferences.getInt(key, defaultValue);
		Pref.sharedPreferences = null;
		return result;
	}

	public static void setValueInt(Context context, String key, int value) {
		Pref.openPref(context);
		Editor prefsPrivateEditor = Pref.sharedPreferences.edit();
		prefsPrivateEditor.putInt(key, value);
		prefsPrivateEditor.commit();
		prefsPrivateEditor = null;
		Pref.sharedPreferences = null;
	}

	public static void setClear(Context context) {
		Pref.openPref(context);
		Editor prefsPrivateEditor = Pref.sharedPreferences.edit();
		prefsPrivateEditor.clear().commit();
		prefsPrivateEditor = null;
		Pref.sharedPreferences = null;
	}

}