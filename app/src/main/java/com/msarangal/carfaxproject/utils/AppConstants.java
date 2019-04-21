package com.msarangal.carfaxproject.utils;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */

// final: because this class was not created with inheritance in mind
public final class AppConstants {

    private AppConstants() {
        // This utility class is not publicly instantiable
    }

    public static final class KEY_PAPER_DB {
        public static final String VEHICLES_API_RESPONSE = "vehicles_api_response";
        public static final String SELECTED_VEHICLE = "selected_vehicle";
    }
}
