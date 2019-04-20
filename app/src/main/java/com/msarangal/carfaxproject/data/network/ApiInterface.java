package com.msarangal.carfaxproject.data.network;

import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public interface ApiInterface {

    @GET()
    Observable<VehiclesResponse> getVehicles(@Url String url);
}
