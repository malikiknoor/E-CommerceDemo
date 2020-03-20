package com.iknoortech.e_commercedemo.model.productData;

import java.util.ArrayList;

public class ProductDataPojo {

    private String status_code;

    private String CategoryUrl;

    private ArrayList<ProductDataList> data;

    private String message;

    private String BannerUrl;

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

    public ArrayList<ProductDataList> getData ()
    {
        return data;
    }

    public void setData (ArrayList<ProductDataList> data)
    {
        this.data = data;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
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
        return "ClassPojo [status_code = "+status_code+", CategoryUrl = "+CategoryUrl+", data = "+data+", message = "+message+", BannerUrl = "+BannerUrl+"]";
    }

}
