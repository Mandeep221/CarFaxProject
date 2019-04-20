package com.msarangal.carfaxproject.data.network;

import android.util.Log;

import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class ApiService implements ApiInteractor {

    @Override
    public Observable<VehiclesResponse> getVehicles(final OnGetVehiclesFinishedListener onFinishedListener) {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Observable<VehiclesResponse> getVehiclesObservable = apiInterface.getVehicles("https://carfax-for-consumers.firebaseio.com/assignment.json/");
        return getVehiclesObservable;
    }
}
