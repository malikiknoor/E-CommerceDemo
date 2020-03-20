package com.iknoortech.e_commercedemo.model.stateList;

import java.util.ArrayList;

public class StateListPojo {

    private String status_code;

    private ArrayList<StateListData> data;

    private String message;

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public ArrayList<StateListData> getData ()
    {
        return data;
    }

    public void setData (ArrayList<StateListData> data)
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
