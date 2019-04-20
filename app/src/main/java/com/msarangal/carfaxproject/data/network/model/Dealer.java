
package com.msarangal.carfaxproject.data.network.model;

import com.squareup.moshi.Json;

public class Dealer {

    @Json(name = "carfaxId")
    private String carfaxId;
    @Json(name = "dealerInventoryUrl")
    private String dealerInventoryUrl;
    @Json(name = "name")
    private String name;
    @Json(name = "address")
    private String address;
    @Json(name = "city")
    private String city;
    @Json(name = "state")
    private String state;
    @Json(name = "zip")
    private String zip;
    @Json(name = "phone")
    private String phone;
    @Json(name = "latitude")
    private String latitude;
    @Json(name = "longitude")
    private String longitude;
    @Json(name = "dealerAverageRating")
    private double dealerAverageRating;
    @Json(name = "dealerReviewDate")
    private String dealerReviewDate;
    @Json(name = "dealerReviewReviewer")
    private String dealerReviewReviewer;
    @Json(name = "dealerReviewRating")
    private int dealerReviewRating;
    @Json(name = "dealerReviewCount")
    private int dealerReviewCount;
    @Json(name = "onlineOnly")
    private boolean onlineOnly;

    public String getCarfaxId() {
        return carfaxId;
    }

    public void setCarfaxId(String carfaxId) {
        this.carfaxId = carfaxId;
    }

    public String getDealerInventoryUrl() {
        return dealerInventoryUrl;
    }

    public void setDealerInventoryUrl(String dealerInventoryUrl) {
        this.dealerInventoryUrl = dealerInventoryUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public double getDealerAverageRating() {
        return dealerAverageRating;
    }

    public void setDealerAverageRating(double dealerAverageRating) {
        this.dealerAverageRating = dealerAverageRating;
    }

    public String getDealerReviewDate() {
        return dealerReviewDate;
    }

    public void setDealerReviewDate(String dealerReviewDate) {
        this.dealerReviewDate = dealerReviewDate;
    }

    public String getDealerReviewReviewer() {
        return dealerReviewReviewer;
    }

    public void setDealerReviewReviewer(String dealerReviewReviewer) {
        this.dealerReviewReviewer = dealerReviewReviewer;
    }

    public int getDealerReviewRating() {
        return dealerReviewRating;
    }

    public void setDealerReviewRating(int dealerReviewRating) {
        this.dealerReviewRating = dealerReviewRating;
    }

    public int getDealerReviewCount() {
        return dealerReviewCount;
    }

    public void setDealerReviewCount(int dealerReviewCount) {
        this.dealerReviewCount = dealerReviewCount;
    }

    public boolean isOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

}
