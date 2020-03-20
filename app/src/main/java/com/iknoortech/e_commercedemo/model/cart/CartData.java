package com.iknoortech.e_commercedemo.model.cart;

public class CartData {

    private String ProductQuantity;

    private String ProductName;

    private String ProductSGST;

    private String IgstAmount;

    private String CgstAmount;

    private String discount;

    private String ProductId;

    private String ProductRegularPrice;

    private String ProductWeight;

    private String ProductCGST;

    private String ProductImage1;

    private String ProductImage2;

    private String Price;

    private String ProductIGST;

    private String ProductOfferPrice;

    private String id;

    private String SgstAmount;

    public String getProductQuantity ()
    {
        return ProductQuantity;
    }

    public void setProductQuantity (String ProductQuantity)
    {
        this.ProductQuantity = ProductQuantity;
    }

    public String getProductName ()
    {
        return ProductName;
    }

    public void setProductName (String ProductName)
    {
        this.ProductName = ProductName;
    }

    public String getProductSGST ()
    {
        return ProductSGST;
    }

    public void setProductSGST (String ProductSGST)
    {
        this.ProductSGST = ProductSGST;
    }

    public String getIgstAmount ()
    {
        return IgstAmount;
    }

    public void setIgstAmount (String IgstAmount)
    {
        this.IgstAmount = IgstAmount;
    }

    public String getCgstAmount ()
    {
        return CgstAmount;
    }

    public void setCgstAmount (String CgstAmount)
    {
        this.CgstAmount = CgstAmount;
    }

    public String getDiscount ()
    {
        return discount;
    }

    public void setDiscount (String discount)
    {
        this.discount = discount;
    }

    public String getProductId ()
    {
        return ProductId;
    }

    public void setProductId (String ProductId)
    {
        this.ProductId = ProductId;
    }

    public String getProductRegularPrice ()
    {
        return ProductRegularPrice;
    }

    public void setProductRegularPrice (String ProductRegularPrice)
    {
        this.ProductRegularPrice = ProductRegularPrice;
    }

    public String getProductWeight ()
    {
        return ProductWeight;
    }

    public void setProductWeight (String ProductWeight)
    {
        this.ProductWeight = ProductWeight;
    }

    public String getProductCGST ()
    {
        return ProductCGST;
    }

    public void setProductCGST (String ProductCGST)
    {
        this.ProductCGST = ProductCGST;
    }

    public String getProductImage1 ()
    {
        return ProductImage1;
    }

    public void setProductImage1 (String ProductImage1)
    {
        this.ProductImage1 = ProductImage1;
    }

    public String getProductImage2 ()
    {
        return ProductImage2;
    }

    public void setProductImage2 (String ProductImage2)
    {
        this.ProductImage2 = ProductImage2;
    }

    public String getPrice ()
    {
        return Price;
    }

    public void setPrice (String Price)
    {
        this.Price = Price;
    }

    public String getProductIGST ()
    {
        return ProductIGST;
    }

    public void setProductIGST (String ProductIGST)
    {
        this.ProductIGST = ProductIGST;
    }

    public String getProductOfferPrice ()
    {
        return ProductOfferPrice;
    }

    public void setProductOfferPrice (String ProductOfferPrice)
    {
        this.ProductOfferPrice = ProductOfferPrice;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSgstAmount ()
    {
        return SgstAmount;
    }

    public void setSgstAmount (String SgstAmount)
    {
        this.SgstAmount = SgstAmount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ProductQuantity = "+ProductQuantity+", ProductName = "+ProductName+", ProductSGST = "+ProductSGST+", IgstAmount = "+IgstAmount+", CgstAmount = "+CgstAmount+", discount = "+discount+", ProductId = "+ProductId+", ProductRegularPrice = "+ProductRegularPrice+", ProductWeight = "+ProductWeight+", ProductCGST = "+ProductCGST+", ProductImage1 = "+ProductImage1+", ProductImage2 = "+ProductImage2+", Price = "+Price+", ProductIGST = "+ProductIGST+", ProductOfferPrice = "+ProductOfferPrice+", id = "+id+", SgstAmount = "+SgstAmount+"]";
    }

}
