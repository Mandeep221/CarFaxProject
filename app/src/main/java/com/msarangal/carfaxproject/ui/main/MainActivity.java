package com.msarangal.carfaxproject.ui.main;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.msarangal.carfaxproject.R;
import com.msarangal.carfaxproject.data.network.ApiService;
import com.msarangal.carfaxproject.data.network.model.VehiclesResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainMvpView {

    private MainPresenter presenter;

    @BindView(android.R.id.content)
    View content;

    @BindView(R.id.am_rv_vehicles)
    RecyclerView rvVehicles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupViews();
        presenter = new MainPresenter(MainActivity.this, this, new ApiService());
        presenter.getVehicles();
    }

    private void setupViews(){
        rvVehicles.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void showErrorMessage(String message) {
        Snackbar.make(content, message,
                Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    public void bindVehiclesData(VehiclesResponse vehiclesResponse) {
        MainVehiclesAdapter adapter = new MainVehiclesAdapter(vehiclesResponse.getListings(), MainActivity.this);
        rvVehicles.setAdapter(adapter);
    }
}
