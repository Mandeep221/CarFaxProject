package com.msarangal.carfaxproject.data.network;

import android.util.Log;

import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class ApiService implements ApiInteractor {

    @Override
    public void getVehicles(final OnGetVehiclesFinishedListener onFinishedListener) {
        Log.d("ApiCall", "getVehicles");
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<VehiclesResponse> call = apiInterface.getVehicles("https://carfax-for-consumers.firebaseio.com/assignment.json/");

        call.enqueue(new Callback<VehiclesResponse>() {
            @Override
            public void onResponse(Call<VehiclesResponse> call, Response<VehiclesResponse> response) {
                if(response.isSuccessful()){
                    // 200
                    onFinishedListener.onApiSuccess(response.body());
                }else {
                    // NOT 200
                    onFinishedListener.onApiFailure(response.code(), response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<VehiclesResponse> call, Throwable t) {
                onFinishedListener.onApiFailure(-1, "");
            }
        });
    }
}
