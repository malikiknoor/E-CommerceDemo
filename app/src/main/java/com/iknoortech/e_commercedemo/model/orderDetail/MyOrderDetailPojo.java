package com.iknoortech.e_commercedemo.model.orderDetail;

import java.util.ArrayList;


public class MyOrderDetailPojo {
    private ArrayList<MyOrderDetail> orderDetails;

    private String status_code;

    private ArrayList<MyOrderDetailTotalOrder> totalOrderProducts;

    private String imageBaseUrl;

    private String message;

    public ArrayList<MyOrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<MyOrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public ArrayList<MyOrderDetailTotalOrder> getTotalOrderProducts() {
        return totalOrderProducts;
    }

    public void setTotalOrderProducts(ArrayList<MyOrderDetailTotalOrder> totalOrderProducts) {
        this.totalOrderProducts = totalOrderProducts;
    }

    public String getImageBaseUrl() {
        return imageBaseUrl;
    }

    public void setImageBaseUrl(String imageBaseUrl) {
        this.imageBaseUrl = imageBaseUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
