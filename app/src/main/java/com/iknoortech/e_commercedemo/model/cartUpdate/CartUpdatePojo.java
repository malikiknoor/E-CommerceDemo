package com.iknoortech.e_commercedemo.model.cartUpdate;

public class CartUpdatePojo {
    private String shipping_charges;

    private String productAmount;

    private String totalGst;

    private String status_code;

    private String bagtotal;

    private String stockRemaining;

    private String Subtotal;

    private String stockQuantity;

    private String totalDiscount;

    private String itemcount;

    private String grand_total;

    private String message;

    public String getShipping_charges ()
    {
        return shipping_charges;
    }

    public void setShipping_charges (String shipping_charges)
    {
        this.shipping_charges = shipping_charges;
    }

    public String getProductAmount ()
    {
        return productAmount;
    }

    public void setProductAmount (String productAmount)
    {
        this.productAmount = productAmount;
    }

    public String getTotalGst ()
    {
        return totalGst;
    }

    public void setTotalGst (String totalGst)
    {
        this.totalGst = totalGst;
    }

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public String getBagtotal ()
    {
        return bagtotal;
    }

    public void setBagtotal (String bagtotal)
    {
        this.bagtotal = bagtotal;
    }

    public String getStockRemaining ()
    {
        return stockRemaining;
    }

    public void setStockRemaining (String stockRemaining)
    {
        this.stockRemaining = stockRemaining;
    }

    public String getSubtotal ()
    {
        return Subtotal;
    }

    public void setSubtotal (String Subtotal)
    {
        this.Subtotal = Subtotal;
    }

    public String getStockQuantity ()
    {
        return stockQuantity;
    }

    public void setStockQuantity (String stockQuantity)
    {
        this.stockQuantity = stockQuantity;
    }

    public String getTotalDiscount ()
    {
        return totalDiscount;
    }

    public void setTotalDiscount (String totalDiscount)
    {
        this.totalDiscount = totalDiscount;
    }

    public String getItemcount ()
    {
        return itemcount;
    }

    public void setItemcount (String itemcount)
    {
        this.itemcount = itemcount;
    }

    public String getGrand_total ()
    {
        return grand_total;
    }

    public void setGrand_total (String grand_total)
    {
        this.grand_total = grand_total;
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
        return "ClassPojo [shipping_charges = "+shipping_charges+", productAmount = "+productAmount+", totalGst = "+totalGst+", status_code = "+status_code+", bagtotal = "+bagtotal+", stockRemaining = "+stockRemaining+", Subtotal = "+Subtotal+", stockQuantity = "+stockQuantity+", totalDiscount = "+totalDiscount+", itemcount = "+itemcount+", grand_total = "+grand_total+", message = "+message+"]";
    }
}
