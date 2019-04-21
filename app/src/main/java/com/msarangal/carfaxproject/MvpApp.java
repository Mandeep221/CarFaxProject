package com.msarangal.carfaxproject;

import android.app.Application;
import android.content.Context;

import com.msarangal.carfaxproject.data.prefs.PrefManager;

import io.paperdb.Paper;

/**
 * Created by Mandeep Sarangal on 20,April,2019
 */
public class MvpApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize shared preferences
        PrefManager.init(getApplicationContext(), "carfaxprefs");

        // initialize paper db
        Paper.init(this);
    }
}
