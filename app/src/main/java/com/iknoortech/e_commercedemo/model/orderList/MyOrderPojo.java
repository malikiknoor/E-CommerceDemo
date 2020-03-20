package com.iknoortech.e_commercedemo.model.orderList;

import java.util.ArrayList;

public class MyOrderPojo {

    private String status_code;

    private ArrayList<MyOrderList> data;

    private String message;

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public ArrayList<MyOrderList> getData ()
    {
        return data;
    }

    public void setData (ArrayList<MyOrderList> data)
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
