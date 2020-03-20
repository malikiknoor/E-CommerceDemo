package com.iknoortech.e_commercedemo.model.shippingAddress;

public class ShippingAddressList {

    private String Address;

    private String UserId;

    private String Phone;

    private String State;

    private String dated;

    private String id;

    private String City;

    private String Pincode;

    private String Name;

    private String defaultAddress;

    private String status;

    private boolean isRedioChecked;

    public boolean isRedioChecked() {
        return isRedioChecked;
    }

    public void setRedioChecked(boolean redioChecked) {
        isRedioChecked = redioChecked;
    }

    public String getAddress ()
    {
        return Address;
    }

    public void setAddress (String Address)
    {
        this.Address = Address;
    }

    public String getUserId ()
    {
        return UserId;
    }

    public void setUserId (String UserId)
    {
        this.UserId = UserId;
    }

    public String getPhone ()
    {
        return Phone;
    }

    public void setPhone (String Phone)
    {
        this.Phone = Phone;
    }

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public String getDated ()
    {
        return dated;
    }

    public void setDated (String dated)
    {
        this.dated = dated;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public String getPincode ()
    {
        return Pincode;
    }

    public void setPincode (String Pincode)
    {
        this.Pincode = Pincode;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getDefaultAddress ()
    {
        return defaultAddress;
    }

    public void setDefaultAddress (String defaultAddress)
    {
        this.defaultAddress = defaultAddress;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Address = "+Address+", UserId = "+UserId+", Phone = "+Phone+", State = "+State+", dated = "+dated+", id = "+id+", City = "+City+", Pincode = "+Pincode+", Name = "+Name+", defaultAddress = "+defaultAddress+", status = "+status+"]";
    }

}
