package com.msarangal.carfaxproject.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */

// final: because this class was not created with inheritance in mind
public final class NetworkUtils {

    private NetworkUtils() {
        // This utility class is not publicly instantiable
    }

    public static boolean isNetworkConnected(Context context) {
//        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
//            Network network = connectivityManager.getActiveNetwork();
//            NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(network);
//            return capabilities != null && (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR));
//        }else {
//            NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
//            if (activeNetwork != null) {
//                // connected to the internet
//                return true;
//            }
//        }
//        return false;

        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}

