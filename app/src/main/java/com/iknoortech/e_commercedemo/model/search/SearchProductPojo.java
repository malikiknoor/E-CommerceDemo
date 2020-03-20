package com.iknoortech.e_commercedemo.model.search;

import java.util.ArrayList;

public class SearchProductPojo {

    private String status_code;

    private ArrayList<SearchProductList> data;

    private String message;

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public ArrayList<SearchProductList> getData() {
        return data;
    }

    public void setData(ArrayList<SearchProductList> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
