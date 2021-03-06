package com.msarangal.carfaxproject.ui.main;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */

import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;

/**
 * It is an interface, that is implemented by the View MainActivity.
 * It contains methods that are exposed to its Presenter MainPresenter for the communication.
 */
public interface MainMvpView {
    void showErrorMessage(String message);
    void bindVehiclesData(VehiclesResponse vehiclesResponse);
}
