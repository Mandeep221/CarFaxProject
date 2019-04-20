package com.msarangal.carfaxproject.ui.main;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.jakewharton.retrofit2.adapter.rxjava2.HttpException;
import com.msarangal.carfaxproject.data.network.ApiInteractor;
import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;
import com.msarangal.carfaxproject.utils.AppConstants;
import com.msarangal.carfaxproject.utils.NetworkUtils;

import io.paperdb.Paper;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class MainPresenter implements MainMvpPresenter, ApiInteractor.OnGetVehiclesFinishedListener {

    private MainMvpView view;
    private Context context;
    private ApiInteractor apiInteractor;

    public MainPresenter(Context context, MainMvpView view, ApiInteractor apiInteractor) {
        this.view = view;
        this.context = context;
        this.apiInteractor = apiInteractor;
    }

    public void getVehicles() {

        if (NetworkUtils.isNetworkConnected(context)) {
            // make api call
            Observable<VehiclesResponse> observable = apiInteractor.getVehicles(this);
            observable.subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<VehiclesResponse>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(VehiclesResponse vehiclesResponse) {
                            saveInPaperDb(vehiclesResponse);
                        }

                        @Override
                        public void onError(Throwable e) {
                            if (e instanceof HttpException) {
                                view.showErrorMessage("Error code : " + ((HttpException) e).code());
                            } else {
                                view.showErrorMessage(e.toString());
                            }
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        } else {
            view.showErrorMessage("No Internet Connection");
            fetchOfflineData();
        }
    }

    @Override
    public void onClickCallDealer() {

    }

    @Override
    public void onApiSuccess(VehiclesResponse vehiclesResponse) {
        Log.d("ApiCall", vehiclesResponse.getListings().size() + "");
    }

    @Override
    public void onApiFailure(int errorCode, String errorBody) {

    }

    // Api response saved for offline support
    private void saveInPaperDb(VehiclesResponse vehiclesResponse) {
        Paper.book().write(AppConstants.KEY_PAPER_DB.VEHICLES_API_RESPONSE, vehiclesResponse);
    }

    private void fetchOfflineData() {
        VehiclesResponse vehiclesResponse = Paper.book().read(AppConstants.KEY_PAPER_DB.VEHICLES_API_RESPONSE);
        if (vehiclesResponse != null) {
            view.showErrorMessage("No Internet, Offline data fetched");
        }else {
            view.showErrorMessage("No Internet, No Offline data");
        }
    }
}
