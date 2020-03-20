package com.iknoortech.e_commercedemo.model.orderDetail;

public class MyOrderDetail {

    private String Address;

    private String totaldiscount;

    private String tax;

    private String City;

    private String Name;

    private String shipping_fee;

    private String order_date;

    private String order_status;

    private String bagtotal;

    private String Phone;

    private String State;

    private String id;

    private String customer_id;

    private String payment_method;

    private String Pincode;

    private String order_total_amount;

    public String getAddress ()
    {
        return Address;
    }

    public void setAddress (String Address)
    {
        this.Address = Address;
    }

    public String getTotaldiscount ()
    {
        return totaldiscount;
    }

    public void setTotaldiscount (String totaldiscount)
    {
        this.totaldiscount = totaldiscount;
    }

    public String getTax ()
    {
        return tax;
    }

    public void setTax (String tax)
    {
        this.tax = tax;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getShipping_fee ()
    {
        return shipping_fee;
    }

    public void setShipping_fee (String shipping_fee)
    {
        this.shipping_fee = shipping_fee;
    }

    public String getOrder_date ()
    {
        return order_date;
    }

    public void setOrder_date (String order_date)
    {
        this.order_date = order_date;
    }

    public String getOrder_status ()
    {
        return order_status;
    }

    public void setOrder_status (String order_status)
    {
        this.order_status = order_status;
    }

    public String getBagtotal ()
    {
        return bagtotal;
    }

    public void setBagtotal (String bagtotal)
    {
        this.bagtotal = bagtotal;
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

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCustomer_id ()
    {
        return customer_id;
    }

    public void setCustomer_id (String customer_id)
    {
        this.customer_id = customer_id;
    }

    public String getPayment_method ()
    {
        return payment_method;
    }

    public void setPayment_method (String payment_method)
    {
        this.payment_method = payment_method;
    }

    public String getPincode ()
    {
        return Pincode;
    }

    public void setPincode (String Pincode)
    {
        this.Pincode = Pincode;
    }

    public String getOrder_total_amount ()
    {
        return order_total_amount;
    }

    public void setOrder_total_amount (String order_total_amount)
    {
        this.order_total_amount = order_total_amount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Address = "+Address+", totaldiscount = "+totaldiscount+", tax = "+tax+", City = "+City+", Name = "+Name+", shipping_fee = "+shipping_fee+", order_date = "+order_date+", order_status = "+order_status+", bagtotal = "+bagtotal+", Phone = "+Phone+", State = "+State+", id = "+id+", customer_id = "+customer_id+", payment_method = "+payment_method+", Pincode = "+Pincode+", order_total_amount = "+order_total_amount+"]";
    }
    
}
