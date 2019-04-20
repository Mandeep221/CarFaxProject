package com.msarangal.carfaxproject.ui.main;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.msarangal.carfaxproject.data.network.ApiInteractor;
import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;
import com.msarangal.carfaxproject.utils.NetworkUtils;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class MainPresenter implements MainMvpPresenter, ApiInteractor.OnGetVehiclesFinishedListener  {

    private MainMvpView view;
    private Context context;
    private ApiInteractor apiInteractor;

    public MainPresenter(Context context, MainMvpView view, ApiInteractor apiInteractor){
        this.view = view;
        this.context = context;
        this.apiInteractor = apiInteractor;
    }

    public void getVehicles(){

        if(NetworkUtils.isNetworkConnected(context)){
            // make api call
            Log.d("ApiCall", "Connected");
            apiInteractor.getVehicles(this);
            //view.handleSceneDuringApiRequest();
        }else {
            Log.d("ApiCall", "NOT Connected");
            //view.showNetworkErrorMessage();
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
}
