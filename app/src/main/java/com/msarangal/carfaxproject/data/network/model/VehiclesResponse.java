
package com.msarangal.carfaxproject.data.network.model;

import java.util.List;
import com.squareup.moshi.Json;

public class VehiclesResponse {

    @Json(name = "searchArea")
    private SearchArea searchArea;
    @Json(name = "totalListingCount")
    private int totalListingCount;
    @Json(name = "enhancedCount")
    private int enhancedCount;
    @Json(name = "backfillCount")
    private int backfillCount;
    @Json(name = "dealerNewCount")
    private int dealerNewCount;
    @Json(name = "dealerUsedCount")
    private int dealerUsedCount;
    @Json(name = "page")
    private int page;
    @Json(name = "pageSize")
    private int pageSize;
    @Json(name = "totalPageCount")
    private int totalPageCount;
    @Json(name = "listings")
    private List<Listing> listings = null;

    public SearchArea getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(SearchArea searchArea) {
        this.searchArea = searchArea;
    }

    public int getTotalListingCount() {
        return totalListingCount;
    }

    public void setTotalListingCount(int totalListingCount) {
        this.totalListingCount = totalListingCount;
    }

    public int getEnhancedCount() {
        return enhancedCount;
    }

    public void setEnhancedCount(int enhancedCount) {
        this.enhancedCount = enhancedCount;
    }

    public int getBackfillCount() {
        return backfillCount;
    }

    public void setBackfillCount(int backfillCount) {
        this.backfillCount = backfillCount;
    }

    public int getDealerNewCount() {
        return dealerNewCount;
    }

    public void setDealerNewCount(int dealerNewCount) {
        this.dealerNewCount = dealerNewCount;
    }

    public int getDealerUsedCount() {
        return dealerUsedCount;
    }

    public void setDealerUsedCount(int dealerUsedCount) {
        this.dealerUsedCount = dealerUsedCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

}
