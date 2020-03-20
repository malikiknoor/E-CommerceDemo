package com.iknoortech.e_commercedemo.model.stateList;

public class StateListData {

    private String state_name;

    private String state_id;

    public String getState_name ()
    {
        return state_name;
    }

    public void setState_name (String state_name)
    {
        this.state_name = state_name;
    }

    public String getState_id ()
    {
        return state_id;
    }

    public void setState_id (String state_id)
    {
        this.state_id = state_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [state_name = "+state_name+", state_id = "+state_id+"]";
    }

}
