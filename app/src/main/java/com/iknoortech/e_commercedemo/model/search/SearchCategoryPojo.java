package com.iknoortech.e_commercedemo.model.search;

import java.util.ArrayList;

public class SearchCategoryPojo {

    private String status_code;

    private ArrayList<SearchCategoryList> data;

    private String message;

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public ArrayList<SearchCategoryList> getData() {
        return data;
    }

    public void setData(ArrayList<SearchCategoryList> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
