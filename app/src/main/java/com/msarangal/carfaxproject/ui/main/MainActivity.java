package com.msarangal.carfaxproject.ui.main;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.msarangal.carfaxproject.R;
import com.msarangal.carfaxproject.data.network.ApiService;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainMvpView {

    private MainPresenter presenter;

    @BindView(android.R.id.content)
    View content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter(MainActivity.this, this, new ApiService());
        presenter.getVehicles();
    }

    @Override
    public void showErrorMessage(String message) {
        Snackbar.make(content, message,
                Snackbar.LENGTH_LONG)
                .show();
    }
}
