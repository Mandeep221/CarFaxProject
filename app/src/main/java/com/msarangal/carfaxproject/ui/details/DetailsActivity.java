package com.msarangal.carfaxproject.ui.details;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.msarangal.carfaxproject.R;
import com.msarangal.carfaxproject.data.network.model.Listing;
import com.msarangal.carfaxproject.utils.AppConstants;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.paperdb.Paper;

/**
 * Created by Mandeep Sarangal on 19,April,2019
 */
public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.ad_iv_vehicle_photo)
    ImageView ivVehiclePhoto;

    @BindView(R.id.ad_btn_call_dealer)
    Button btnCallDealer;

    @BindView(R.id.ad_tv_year_make_model_trim)
    TextView tvYearMakeModelTrim;

    @BindView(R.id.ad_tv_price_mileage)
    TextView tvPriceMileage;

    @BindView(R.id.ad_tv_location_value)
    TextView tvLocation;

    @BindView(R.id.ad_tv_ext_colour_value)
    TextView tvExteriorColour;

    @BindView(R.id.ad_tv_int_colour_value)
    TextView tvInteriorColour;

    @BindView(R.id.ad_tv_drive_type_value)
    TextView tvDriveType;

    @BindView(R.id.ad_tv_transmission_value)
    TextView tvTransmission;

    @BindView(R.id.ad_tv_body_style_value)
    TextView tvBodyStyle;

    @BindView(R.id.ad_tv_engine_value)
    TextView tvEngine;

    @BindView(R.id.ad_tv_fuel_value)
    TextView tvFuel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        setUpViews();
    }

    private void setUpViews(){
        Listing listing = Paper.book().read(AppConstants.KEY_PAPER_DB.SELECTED_VEHICLE);
        if(listing.getImages() != null){
            Glide.with(DetailsActivity.this)
                    .load(listing.getImages().getFirstPhoto().getLarge())
                    .centerCrop()
                    .placeholder(R.drawable.placeholder_photo)
                    .into(ivVehiclePhoto);
        }

        tvYearMakeModelTrim.setText(listing.getYear() + " "+ listing.getMake()+ " "+listing.getModel());
        tvPriceMileage.setText(listing.getCurrentPrice() +" | "+ listing.getMileage());

        tvLocation.setText(listing.getDealer().getCity() + ", "+listing.getDealer().getState());
        tvExteriorColour.setText(listing.getExteriorColor());
        tvInteriorColour.setText(listing.getInteriorColor());
        tvDriveType.setText(listing.getDrivetype());
        tvTransmission.setText(listing.getTransmission());
        tvBodyStyle.setText(listing.getBodytype());
        tvEngine.setText(listing.getEngine());
        tvFuel.setText(listing.getFuel());
    }
}
