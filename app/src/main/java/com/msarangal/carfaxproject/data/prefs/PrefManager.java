package com.msarangal.carfaxproject.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Mandeep Sarangal on 21,April,2019
 */
public class PrefManager {

    private static final String PREF_KEY_CALL_PERMISSION = "PREF_KEY_CALL_PERMISSION";
    private static SharedPreferences mPrefs;

    public static void init(Context context, String prefFileName){
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
        if(mPrefs != null){
            Log.d("PrefManager", "init");
        }else {
            Log.d("PrefManager", null);
        }
    }

    public static void setCallPermission(boolean permission){
        mPrefs.edit().putBoolean(PREF_KEY_CALL_PERMISSION, permission).apply();
    }

    public static boolean getCallPermission(){
       return mPrefs.getBoolean(PREF_KEY_CALL_PERMISSION, false);
    }
}
