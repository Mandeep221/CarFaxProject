package com.msarangal.carfaxproject.ui.main;

import android.content.Context;
import android.view.View;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class MainPresenter implements MainMvpPresenter {

    private View view;
    private Context context;

    public MainPresenter(Context context, View view){
        this.view = view;
        this.context = context;
    }

    @Override
    public void onClickCallDealer() {

    }
}
