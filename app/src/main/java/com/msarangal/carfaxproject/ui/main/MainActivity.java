package com.msarangal.carfaxproject.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.msarangal.carfaxproject.R;
import com.msarangal.carfaxproject.data.network.ApiService;

public class MainActivity extends AppCompatActivity implements MainMvpView {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(MainActivity.this, this, new ApiService());

        presenter.getVehicles();
    }
}
