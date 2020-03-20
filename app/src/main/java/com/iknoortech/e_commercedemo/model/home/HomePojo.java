package com.iknoortech.e_commercedemo.model.home;

import java.util.ArrayList;

public class HomePojo {

    private ArrayList<HomeBanner> data_banner;

    private String status_code;

    private String CategoryUrl;

    private ArrayList<HomeCategory> data_cate;

    private String message;

    private String BannerUrl;

    public ArrayList<HomeBanner> getData_banner ()
    {
        return data_banner;
    }

    public void setData_banner (ArrayList<HomeBanner> data_banner)
    {
        this.data_banner = data_banner;
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

    public ArrayList<HomeCategory> getData_cate ()
    {
        return data_cate;
    }

    public void setData_cate (ArrayList<HomeCategory> data_cate)
    {
        this.data_cate = data_cate;
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
        return "ClassPojo [data_banner = "+data_banner+", status_code = "+status_code+", CategoryUrl = "+CategoryUrl+", data_cate = "+data_cate+", message = "+message+", BannerUrl = "+BannerUrl+"]";
    }

}
