package com.msarangal.carfaxproject.data.network;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.msarangal.carfaxproject.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class ApiClient{

    private static Retrofit retrofit;
    private static final String TARGET_URL = "https://carfax-for-consumers.firebaseio.com/assignment.json/";

    public static Retrofit getClient(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        if (BuildConfig.DEBUG) {
            // development build
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            // production build
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }

        httpClient.addInterceptor(logging);

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(TARGET_URL)
                    .addConverterFactory
                            (MoshiConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(httpClient.build())
                    .build();
        }

        return retrofit;
    }
}
