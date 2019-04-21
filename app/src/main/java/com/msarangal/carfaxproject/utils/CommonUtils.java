package com.msarangal.carfaxproject.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Mandeep Sarangal on 21,April,2019
 */
public class CommonUtils {

    public static String getFormattedPrice(double price){
        NumberFormat formatter = new DecimalFormat("#,###");
        return formatter.format(price);
    }

    public static String getFormattedMileage(int mileage){
        String formattedMileage = "";
        if (Math.abs(mileage / 1000) > 1) {
            float temp = (mileage / 1000f);
            formattedMileage = String.format(java.util.Locale.US,"%.1f", temp) + "k";
        } else {
            formattedMileage = String.valueOf(mileage);
        }
        return formattedMileage;
    }
}
