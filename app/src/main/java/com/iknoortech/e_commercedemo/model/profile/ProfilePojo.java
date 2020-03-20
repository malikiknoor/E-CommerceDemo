package com.iknoortech.e_commercedemo.model.profile;

public class ProfilePojo {

    private String pincode;

    private String status_code;

    private String address;

    private String city;

    private String DeviceId;

    private String mobile;

    private String type;

    private String message;

    private String approve;

    private String name;

    private String ProfilePic;

    private String id;

    private String state;

    private String state_id;

    private String email;

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getPincode ()
    {
        return pincode;
    }

    public void setPincode (String pincode)
    {
        this.pincode = pincode;
    }

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getDeviceId ()
    {
        return DeviceId;
    }

    public void setDeviceId (String DeviceId)
    {
        this.DeviceId = DeviceId;
    }

    public String getMobile ()
    {
        return mobile;
    }

    public void setMobile (String mobile)
    {
        this.mobile = mobile;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getApprove ()
    {
        return approve;
    }

    public void setApprove (String approve)
    {
        this.approve = approve;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getProfilePic ()
    {
        return ProfilePic;
    }

    public void setProfilePic (String ProfilePic)
    {
        this.ProfilePic = ProfilePic;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pincode = "+pincode+", status_code = "+status_code+", address = "+address+", city = "+city+", DeviceId = "+DeviceId+", mobile = "+mobile+", type = "+type+", message = "+message+", approve = "+approve+", name = "+name+", ProfilePic = "+ProfilePic+", id = "+id+", state = "+state+", email = "+email+"]";
    }
}
