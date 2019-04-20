
package com.msarangal.carfaxproject.data.network.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Listing {

    @Json(name = "dealer")
    private Dealer dealer;
    @Json(name = "id")
    private String id;
    @Json(name = "vin")
    private String vin;
    @Json(name = "year")
    private int year;
    @Json(name = "make")
    private String make;
    @Json(name = "model")
    private String model;
    @Json(name = "trim")
    private String trim;
    @Json(name = "subTrim")
    private String subTrim;
    @Json(name = "topOptions")
    private List<String> topOptions = null;
    @Json(name = "mileage")
    private int mileage;
    @Json(name = "listPrice")
    private double listPrice;
    @Json(name = "currentPrice")
    private double currentPrice;
    @Json(name = "monthlyPaymentEstimate")
    private MonthlyPaymentEstimate monthlyPaymentEstimate;
    @Json(name = "onePrice")
    private double onePrice;
    @Json(name = "badge")
    private String badge;
    @Json(name = "exteriorColor")
    private String exteriorColor;
    @Json(name = "interiorColor")
    private String interiorColor;
    @Json(name = "engine")
    private String engine;
    @Json(name = "displacement")
    private String displacement;
    @Json(name = "drivetype")
    private String drivetype;
    @Json(name = "transmission")
    private String transmission;
    @Json(name = "fuel")
    private String fuel;
    @Json(name = "mpgCity")
    private int mpgCity;
    @Json(name = "mpgHighway")
    private int mpgHighway;
    @Json(name = "bodytype")
    private String bodytype;
    @Json(name = "vehicleCondition")
    private String vehicleCondition;
    @Json(name = "cabType")
    private String cabType;
    @Json(name = "bedLength")
    private String bedLength;
    @Json(name = "followCount")
    private int followCount;
    @Json(name = "stockNumber")
    private String stockNumber;
    @Json(name = "imageCount")
    private int imageCount;
    @Json(name = "images")
    private Images images;
    @Json(name = "firstSeen")
    private String firstSeen;
    @Json(name = "oneOwner")
    private boolean oneOwner;
    @Json(name = "noAccidents")
    private boolean noAccidents;
    @Json(name = "serviceRecords")
    private boolean serviceRecords;
    @Json(name = "personalUse")
    private boolean personalUse;
    @Json(name = "distanceToDealer")
    private double distanceToDealer;
    @Json(name = "hasViewed")
    private boolean hasViewed;
    @Json(name = "sentLead")
    private boolean sentLead;
    @Json(name = "sentLeadAt")
    private Object sentLeadAt;
    @Json(name = "recordType")
    private String recordType;
    @Json(name = "dealerType")
    private String dealerType;
    @Json(name = "backfill")
    private boolean backfill;
    @Json(name = "advantage")
    private boolean advantage;
    @Json(name = "vdpUrl")
    private String vdpUrl;
    @Json(name = "sortScore")
    private double sortScore;
    @Json(name = "isEnriched")
    private boolean isEnriched;
    @Json(name = "following")
    private boolean following;
    @Json(name = "onlineOnly")
    private boolean onlineOnly;
    @Json(name = "certified")
    private boolean certified;

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getSubTrim() {
        return subTrim;
    }

    public void setSubTrim(String subTrim) {
        this.subTrim = subTrim;
    }

    public List<String> getTopOptions() {
        return topOptions;
    }

    public void setTopOptions(List<String> topOptions) {
        this.topOptions = topOptions;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public MonthlyPaymentEstimate getMonthlyPaymentEstimate() {
        return monthlyPaymentEstimate;
    }

    public void setMonthlyPaymentEstimate(MonthlyPaymentEstimate monthlyPaymentEstimate) {
        this.monthlyPaymentEstimate = monthlyPaymentEstimate;
    }

    public double getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(double onePrice) {
        this.onePrice = onePrice;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(int mpgCity) {
        this.mpgCity = mpgCity;
    }

    public int getMpgHighway() {
        return mpgHighway;
    }

    public void setMpgHighway(int mpgHighway) {
        this.mpgHighway = mpgHighway;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getBedLength() {
        return bedLength;
    }

    public void setBedLength(String bedLength) {
        this.bedLength = bedLength;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public int getImageCount() {
        return imageCount;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public boolean isOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(boolean oneOwner) {
        this.oneOwner = oneOwner;
    }

    public boolean isNoAccidents() {
        return noAccidents;
    }

    public void setNoAccidents(boolean noAccidents) {
        this.noAccidents = noAccidents;
    }

    public boolean isServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(boolean serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public boolean isPersonalUse() {
        return personalUse;
    }

    public void setPersonalUse(boolean personalUse) {
        this.personalUse = personalUse;
    }

    public double getDistanceToDealer() {
        return distanceToDealer;
    }

    public void setDistanceToDealer(double distanceToDealer) {
        this.distanceToDealer = distanceToDealer;
    }

    public boolean isHasViewed() {
        return hasViewed;
    }

    public void setHasViewed(boolean hasViewed) {
        this.hasViewed = hasViewed;
    }

    public boolean isSentLead() {
        return sentLead;
    }

    public void setSentLead(boolean sentLead) {
        this.sentLead = sentLead;
    }

    public Object getSentLeadAt() {
        return sentLeadAt;
    }

    public void setSentLeadAt(Object sentLeadAt) {
        this.sentLeadAt = sentLeadAt;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public boolean isBackfill() {
        return backfill;
    }

    public void setBackfill(boolean backfill) {
        this.backfill = backfill;
    }

    public boolean isAdvantage() {
        return advantage;
    }

    public void setAdvantage(boolean advantage) {
        this.advantage = advantage;
    }

    public String getVdpUrl() {
        return vdpUrl;
    }

    public void setVdpUrl(String vdpUrl) {
        this.vdpUrl = vdpUrl;
    }

    public double getSortScore() {
        return sortScore;
    }

    public void setSortScore(double sortScore) {
        this.sortScore = sortScore;
    }

    public boolean isIsEnriched() {
        return isEnriched;
    }

    public void setIsEnriched(boolean isEnriched) {
        this.isEnriched = isEnriched;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

}
