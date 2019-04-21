package com.msarangal.carfaxproject.ui.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.msarangal.carfaxproject.R;
import com.msarangal.carfaxproject.data.network.model.Listing;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Mandeep Sarangal on 20,April,2019
 */
public class MainVehiclesAdapter extends RecyclerView.Adapter<MainVehiclesAdapter.MainVehicleViewHolder> {

    List<Listing> mDataSet;
    Context mContext;
    private static final String TAG = MainVehiclesAdapter.class.getSimpleName();

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    OnItemClickListener onItemClickListener;

    public MainVehiclesAdapter(List<Listing> dataSet, Context context, OnItemClickListener onItemClickListener){
        this.mDataSet = dataSet;
        this.mContext = context;
        this.onItemClickListener = onItemClickListener;
        Log.d("MainVehiclesAdapter", mDataSet.size()+"");
    }

    @NonNull
    @Override
    public MainVehicleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_listing_row, viewGroup, false);
        return new MainVehicleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainVehiclesAdapter.MainVehicleViewHolder viewHolder, int position) {
        Listing listing = mDataSet.get(position);

        if(listing.getImages() != null){
            Glide.with(mContext)
                    .load(listing.getImages().getFirstPhoto().getLarge())
                    .centerCrop()
                    .placeholder(R.drawable.placeholder_photo)
                    .into(viewHolder.ivVehiclePhoto);
            viewHolder.tvPhotoUrlNotFound.setVisibility(View.GONE);
        }else {
            Glide.with(mContext).clear(viewHolder.ivVehiclePhoto);
            viewHolder.tvPhotoUrlNotFound.setVisibility(View.VISIBLE);
            Log.d(TAG, "Photo url at position : "+ position + " is null");
        }

        viewHolder.tvYearMake.setText(listing.getYear()+"");
        viewHolder.tvPriceMileage.setText(listing.getCurrentPrice()+" | "+listing.getMileage());
        viewHolder.tvLocation.setText(listing.getDealer().getCity()+ ", "+ listing.getDealer().getState());
    }

    @Override
    public int getItemCount() {
        return this.mDataSet.size();
    }

    public class MainVehicleViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.ilr_vehicle_photo)
        ImageView ivVehiclePhoto;

        @BindView(R.id.ilr_year_make)
        TextView tvYearMake;

        @BindView(R.id.ilr_price_mileage)
        TextView tvPriceMileage;

        @BindView(R.id.ilr_tv_photo_url_not_found)
        TextView tvPhotoUrlNotFound;

        @BindView(R.id.ilr_location)
        TextView tvLocation;

        @BindView(R.id.ilr_btn_call_dealer)
        Button btnCallDealer;

        public MainVehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.ilr_cv_container)
        void onItemClick(View view){
            onItemClickListener.onItemClick(view, getAdapterPosition());
        }
    }
}
