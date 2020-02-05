package com.app.tripdetails.utils;

import android.content.Context;
import android.location.Location;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

import com.app.tripdetails.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    public static String MY_TRIP_ID = "MY_TRIP_ID";
    public static String MY_CURRENT_LAT = "MY_CURRENT_LAT";
    public static String MY_CURRENT_LNG = "MY_CURRENT_LNG";

    public static String COMMON_DATE_FORMAT_DISPLAY = "dd/MM/yyyy HH:mm";
    public static View makeMeShake(View view, int duration, int offset) {

        if (duration <= 0)
            duration = 50;

        if (offset <= 0)
            offset = 4;


        if (view != null) {
            Animation anim = new TranslateAnimation(-offset, offset, 0, 0);
            anim.setDuration(duration);
            anim.setRepeatMode(Animation.REVERSE);
            anim.setRepeatCount(5);
            view.startAnimation(anim);
        }
        return view;
    }

    public static final String KEY_REQUESTING_LOCATION_UPDATES = "requesting_locaction_updates";

    /**
     * Returns true if requesting location updates, otherwise returns false.
     *
     * @param context The {@link Context}.
     */
    public static boolean requestingLocationUpdates(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean(KEY_REQUESTING_LOCATION_UPDATES, false);
    }

    /**
     * Stores the location updates state in SharedPreferences.
     * @param requestingLocationUpdates The location updates state.
     */
    public static void setRequestingLocationUpdates(Context context, boolean requestingLocationUpdates) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putBoolean(KEY_REQUESTING_LOCATION_UPDATES, requestingLocationUpdates)
                .apply();
    }

    /**
     * Returns the {@code location} object as a human readable string.
     * @param location  The {@link Location}.
     */
    public static String getLocationText(Location location) {
        return location == null ? "Unknown location" :
                "(" + location.getLatitude() + ", " + location.getLongitude() + ")";
    }

    public  static String getLocationTitle(Context context) {
        return "Location Updated";
    }


    public static String getCurrentDateTime(String dateTimePattern) {

        if (TextUtils.isEmpty(dateTimePattern)) {
            dateTimePattern=COMMON_DATE_FORMAT_DISPLAY;
        }
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateTimePattern);
        return sdf.format(cal.getTime());
    }
}
