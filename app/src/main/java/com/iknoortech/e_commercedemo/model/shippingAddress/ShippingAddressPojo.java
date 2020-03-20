package com.iknoortech.e_commercedemo.model.shippingAddress;

import java.util.ArrayList;

public class ShippingAddressPojo {

    private String status_code;

    private String message;

    private ArrayList<ShippingAddressList> data;

    public ArrayList<ShippingAddressList> getData() {
        return data;
    }

    public void setData(ArrayList<ShippingAddressList> data) {
        this.data = data;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
