package com.iknoortech.e_commercedemo.model.cart;

import java.util.ArrayList;

public class CartPojo {

    private String shipping_charges;

    private String totalGst;

    private String status_code;

    private String CategoryUrl;

    private ArrayList<CartData> data;

    private String total_price;

    private String bagtotal;

    private String totalDiscount;

    private String grand_total;

    private String message;

    private String igst;

    private String BannerUrl;

    public String getShipping_charges ()
    {
        return shipping_charges;
    }

    public void setShipping_charges (String shipping_charges)
    {
        this.shipping_charges = shipping_charges;
    }

    public String getTotalGst ()
    {
        return totalGst;
    }

    public void setTotalGst (String totalGst)
    {
        this.totalGst = totalGst;
    }

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public String getCategoryUrl ()
    {
        return CategoryUrl;
    }

    public void setCategoryUrl (String CategoryUrl)
    {
        this.CategoryUrl = CategoryUrl;
    }

    public ArrayList<CartData> getData ()
    {
        return data;
    }

    public void setData (ArrayList<CartData> data)
    {
        this.data = data;
    }

    public String getTotal_price ()
    {
        return total_price;
    }

    public void setTotal_price (String total_price)
    {
        this.total_price = total_price;
    }

    public String getBagtotal ()
    {
        return bagtotal;
    }

    public void setBagtotal (String bagtotal)
    {
        this.bagtotal = bagtotal;
    }

    public String getTotalDiscount ()
    {
        return totalDiscount;
    }

    public void setTotalDiscount (String totalDiscount)
    {
        this.totalDiscount = totalDiscount;
    }

    public String getGrand_total ()
    {
        return grand_total;
    }

    public void setGrand_total (String grand_total)
    {
        this.grand_total = grand_total;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getIgst ()
    {
        return igst;
    }

    public void setIgst (String igst)
    {
        this.igst = igst;
    }

    public String getBannerUrl ()
    {
        return BannerUrl;
    }

    public void setBannerUrl (String BannerUrl)
    {
        this.BannerUrl = BannerUrl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [shipping_charges = "+shipping_charges+", totalGst = "+totalGst+", status_code = "+status_code+", CategoryUrl = "+CategoryUrl+", data = "+data+", total_price = "+total_price+", bagtotal = "+bagtotal+", totalDiscount = "+totalDiscount+", grand_total = "+grand_total+", message = "+message+", igst = "+igst+", BannerUrl = "+BannerUrl+"]";
    }

}
