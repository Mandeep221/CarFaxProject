package com.msarangal.carfaxproject.ui.main;

import android.content.Context;
import android.util.Log;

import com.msarangal.carfaxproject.R;
import com.msarangal.carfaxproject.data.network.ApiInteractor;
import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;
import com.msarangal.carfaxproject.utils.AppConstants;
import com.msarangal.carfaxproject.utils.NetworkUtils;

import io.paperdb.Paper;


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
            apiInteractor.getVehicles(this);
        } else {
            fetchOfflineData();
        }
    }

    @Override
    public void onApiSuccess(VehiclesResponse vehiclesResponse) {
        saveInPaperDb(vehiclesResponse);
        view.bindVehiclesData(vehiclesResponse);
    }

    @Override
    public void onApiFailure(int errorCode, String errorBody) {
        view.showErrorMessage("Error Code : " + errorCode +" --> "+errorBody);
    }

    // Api response saved for offline support
    private void saveInPaperDb(VehiclesResponse vehiclesResponse) {
        Paper.book().write(AppConstants.KEY_PAPER_DB.VEHICLES_API_RESPONSE, vehiclesResponse);
    }

    private void fetchOfflineData() {
        VehiclesResponse vehiclesResponse = Paper.book().read(AppConstants.KEY_PAPER_DB.VEHICLES_API_RESPONSE);
        if (vehiclesResponse != null) {
            view.showErrorMessage(context.getString(R.string.no_internet_offline_data_fetched));
            view.bindVehiclesData(vehiclesResponse);
        }else {
            view.showErrorMessage(context.getString(R.string.no_internet_no_cache));
        }
    }
}
