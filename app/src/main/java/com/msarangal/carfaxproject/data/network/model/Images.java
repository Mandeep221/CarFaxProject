
package com.msarangal.carfaxproject.data.network.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Images {

    @Json(name = "baseUrl")
    private String baseUrl;
    @Json(name = "large")
    private List<String> large = null;
    @Json(name = "medium")
    private List<String> medium = null;
    @Json(name = "small")
    private List<String> small = null;
    @Json(name = "firstPhoto")
    private FirstPhoto firstPhoto;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public List<String> getLarge() {
        return large;
    }

    public void setLarge(List<String> large) {
        this.large = large;
    }

    public List<String> getMedium() {
        return medium;
    }

    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    public List<String> getSmall() {
        return small;
    }

    public void setSmall(List<String> small) {
        this.small = small;
    }

    public FirstPhoto getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(FirstPhoto firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

}
