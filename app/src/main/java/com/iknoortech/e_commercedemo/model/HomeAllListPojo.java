package com.iknoortech.e_commercedemo.model;

import java.util.ArrayList;

public class HomeAllListPojo {

    private String categoryName;

    private ArrayList<HomeAllListData> allListData;

    private boolean isAdd = false;

    public HomeAllListPojo(String categoryName, ArrayList<HomeAllListData> allListData, boolean isAdd) {
        this.categoryName = categoryName;
        this.allListData = allListData;
        this.isAdd = isAdd;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<HomeAllListData> getAllListData() {
        return allListData;
    }

    public void setAllListData(ArrayList<HomeAllListData> allListData) {
        this.allListData = allListData;
    }

    public boolean isAdd() {
        return isAdd;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }
}
