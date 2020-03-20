package com.iknoortech.e_commercedemo.model.orderList;

public class MyOrderList {

    private String order_no;

    private String order_date_time;

    private String Address;

    private String order_payment_status;

    private String address_id;

    private String order_status_id;

    private String tax;

    private String City;

    private String Name;

    private String shipping_fee;

    private String order_date;

    private String order_status;

    private String payableamount;

    private String Phone;

    private String State;

    private String id;

    private String customer_id;

    private String payment_method;

    private String Pincode;

    private String order_total_amount;

    public String getOrder_no ()
    {
        return order_no;
    }

    public void setOrder_no (String order_no)
    {
        this.order_no = order_no;
    }

    public String getOrder_date_time ()
    {
        return order_date_time;
    }

    public void setOrder_date_time (String order_date_time)
    {
        this.order_date_time = order_date_time;
    }

    public String getAddress ()
    {
        return Address;
    }

    public void setAddress (String Address)
    {
        this.Address = Address;
    }

    public String getOrder_payment_status ()
    {
        return order_payment_status;
    }

    public void setOrder_payment_status (String order_payment_status)
    {
        this.order_payment_status = order_payment_status;
    }

    public String getAddress_id ()
    {
        return address_id;
    }

    public void setAddress_id (String address_id)
    {
        this.address_id = address_id;
    }

    public String getOrder_status_id ()
    {
        return order_status_id;
    }

    public void setOrder_status_id (String order_status_id)
    {
        this.order_status_id = order_status_id;
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

    public String getPayableamount ()
    {
        return payableamount;
    }

    public void setPayableamount (String payableamount)
    {
        this.payableamount = payableamount;
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
        return "ClassPojo [order_no = "+order_no+", order_date_time = "+order_date_time+", Address = "+Address+", order_payment_status = "+order_payment_status+", address_id = "+address_id+", order_status_id = "+order_status_id+", tax = "+tax+", City = "+City+", Name = "+Name+", shipping_fee = "+shipping_fee+", order_date = "+order_date+", order_status = "+order_status+", payableamount = "+payableamount+", Phone = "+Phone+", State = "+State+", id = "+id+", customer_id = "+customer_id+", payment_method = "+payment_method+", Pincode = "+Pincode+", order_total_amount = "+order_total_amount+"]";
    }
    
}
