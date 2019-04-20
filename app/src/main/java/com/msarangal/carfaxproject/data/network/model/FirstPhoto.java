
package com.msarangal.carfaxproject.data.network.model;

import com.squareup.moshi.Json;

public class FirstPhoto {

    @Json(name = "small")
    private String small;
    @Json(name = "large")
    private String large;
    @Json(name = "medium")
    private String medium;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

}
