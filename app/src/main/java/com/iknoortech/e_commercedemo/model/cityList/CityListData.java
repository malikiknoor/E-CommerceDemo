package com.iknoortech.e_commercedemo.model.cityList;

public class CityListData {

    private String city_name;

    private String state_id;

    private String city_id;

    public String getCity_name ()
    {
        return city_name;
    }

    public void setCity_name (String city_name)
    {
        this.city_name = city_name;
    }

    public String getState_id ()
    {
        return state_id;
    }

    public void setState_id (String state_id)
    {
        this.state_id = state_id;
    }

    public String getCity_id ()
    {
        return city_id;
    }

    public void setCity_id (String city_id)
    {
        this.city_id = city_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [city_name = "+city_name+", state_id = "+state_id+", city_id = "+city_id+"]";
    }

}
