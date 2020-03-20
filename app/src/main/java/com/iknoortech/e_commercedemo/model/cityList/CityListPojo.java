package com.iknoortech.e_commercedemo.model.cityList;

import java.util.ArrayList;

public class CityListPojo {

    private String status_code;

    private ArrayList<CityListData> data;

    private String message;

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public ArrayList<CityListData> getData ()
    {
        return data;
    }

    public void setData (ArrayList<CityListData> data)
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

    @Override
    public String toString()
    {
        return "ClassPojo [status_code = "+status_code+", data = "+data+", message = "+message+"]";
    }

}