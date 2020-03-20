package com.iknoortech.e_commercedemo.model.login;

public class LoginPojo {

    private String status_code;

    private String city;

    private String mobile;

    private String type;

    private String message;

    private String approve;

    private String district;

    private String itmcount;

    private String name;

    private String ProfilePic;

    private String id;

    private String state;

    private String email;

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
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

    public String getDistrict ()
    {
        return district;
    }

    public void setDistrict (String district)
    {
        this.district = district;
    }

    public String getItmcount ()
    {
        return itmcount;
    }

    public void setItmcount (String itmcount)
    {
        this.itmcount = itmcount;
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
        return "ClassPojo [status_code = "+status_code+", city = "+city+", mobile = "+mobile+", type = "+type+", message = "+message+", approve = "+approve+", district = "+district+", itmcount = "+itmcount+", name = "+name+", ProfilePic = "+ProfilePic+", id = "+id+", state = "+state+", email = "+email+"]";
    }

}
