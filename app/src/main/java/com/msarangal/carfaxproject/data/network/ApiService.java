package com.msarangal.carfaxproject.data.network;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;
import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class ApiService implements ApiInteractor {

    @Override
    public void getVehicles(final OnGetVehiclesFinishedListener onFinishedListener) {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Observable<VehiclesResponse> getVehiclesObservable = apiInterface.getVehicles();

        getVehiclesObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<VehiclesResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(VehiclesResponse vehiclesResponse) {
                        onFinishedListener.onApiSuccess(vehiclesResponse);
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (e instanceof HttpException) {
                            onFinishedListener.onApiFailure(((HttpException) e).code(), "Something went wrong");
                        } else {
                            onFinishedListener.onApiFailure(-1, e.toString());
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
