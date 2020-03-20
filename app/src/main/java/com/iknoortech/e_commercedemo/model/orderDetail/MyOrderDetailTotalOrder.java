package com.iknoortech.e_commercedemo.model.orderDetail;

public class MyOrderDetailTotalOrder {
    private String ProductImage1;

    private String total;

    private String quantity;

    private String ProductName;

    private String price;

    private String product_id;

    private String tax;

    private String id;

    private String customer_id;

    private String ProductWeight;

    private String order_id;

    private String status;

    public String getProductImage1 ()
    {
        return ProductImage1;
    }

    public void setProductImage1 (String ProductImage1)
    {
        this.ProductImage1 = ProductImage1;
    }

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getProductName ()
    {
        return ProductName;
    }

    public void setProductName (String ProductName)
    {
        this.ProductName = ProductName;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getProduct_id ()
    {
        return product_id;
    }

    public void setProduct_id (String product_id)
    {
        this.product_id = product_id;
    }

    public String getTax ()
    {
        return tax;
    }

    public void setTax (String tax)
    {
        this.tax = tax;
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

    public String getProductWeight ()
    {
        return ProductWeight;
    }

    public void setProductWeight (String ProductWeight)
    {
        this.ProductWeight = ProductWeight;
    }

    public String getOrder_id ()
    {
        return order_id;
    }

    public void setOrder_id (String order_id)
    {
        this.order_id = order_id;
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
        return "ClassPojo [ProductImage1 = "+ProductImage1+", total = "+total+", quantity = "+quantity+", ProductName = "+ProductName+", price = "+price+", product_id = "+product_id+", tax = "+tax+", id = "+id+", customer_id = "+customer_id+", ProductWeight = "+ProductWeight+", order_id = "+order_id+", status = "+status+"]";
    }
}
