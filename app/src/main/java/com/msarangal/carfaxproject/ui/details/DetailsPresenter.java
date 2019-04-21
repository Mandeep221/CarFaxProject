package com.msarangal.carfaxproject.ui.details;

import android.content.Context;
import android.view.View;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class DetailsPresenter implements DetailsMvpPresenter {

    private DetailsMvpView view;
    private Context context;

    public DetailsPresenter(Context context, DetailsMvpView view){
        this.view = view;
        this.context = context;
    }
}
