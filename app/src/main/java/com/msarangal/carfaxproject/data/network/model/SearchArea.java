
package com.msarangal.carfaxproject.data.network.model;

import java.util.List;
import com.squareup.moshi.Json;

public class SearchArea {

    @Json(name = "city")
    private String city;
    @Json(name = "state")
    private String state;
    @Json(name = "zip")
    private String zip;
    @Json(name = "latitude")
    private double latitude;
    @Json(name = "longitude")
    private double longitude;
    @Json(name = "radius")
    private double radius;
    @Json(name = "dynamicRadius")
    private boolean dynamicRadius;
    @Json(name = "dynamicRadii")
    private List<Double> dynamicRadii = null;

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isDynamicRadius() {
        return dynamicRadius;
    }

    public void setDynamicRadius(boolean dynamicRadius) {
        this.dynamicRadius = dynamicRadius;
    }

    public List<Double> getDynamicRadii() {
        return dynamicRadii;
    }

    public void setDynamicRadii(List<Double> dynamicRadii) {
        this.dynamicRadii = dynamicRadii;
    }

}
