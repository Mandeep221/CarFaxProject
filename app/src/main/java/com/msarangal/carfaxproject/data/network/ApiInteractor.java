package com.msarangal.carfaxproject.data.network;

import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;

import io.reactivex.Observable;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public interface ApiInteractor {

    interface OnGetVehiclesFinishedListener {
        void onApiSuccess(VehiclesResponse customer);
        void onApiFailure(int errorCode, String errorBody);
    }

    Observable<VehiclesResponse> getVehicles(OnGetVehiclesFinishedListener onFinishedListener);

}
