package com.iknoortech.e_commercedemo.model.wishList;

public class WishListData {

    private String ProductImage1;

    private String ProductImage2;

    private String ProductName;

    private String ProductId;

    private String ProductWeight;

    private String ProductRegularPrice;

    private String ProductStock;

    private boolean isStock;

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    public String getProductStock() {
        return ProductStock;
    }

    public void setProductStock(String productStock) {
        ProductStock = productStock;
    }

    private boolean IsCart;

    public boolean isCart() {
        return IsCart;
    }

    public void setCart(boolean cart) {
        IsCart = cart;
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

    public String getProductName ()
    {
        return ProductName;
    }

    public void setProductName (String ProductName)
    {
        this.ProductName = ProductName;
    }

    public String getProductId ()
    {
        return ProductId;
    }

    public void setProductId (String ProductId)
    {
        this.ProductId = ProductId;
    }

    public String getProductWeight() {
        return ProductWeight;
    }

    public void setProductWeight(String productWeight) {
        ProductWeight = productWeight;
    }

    public String getProductRegularPrice ()
    {
        return ProductRegularPrice;
    }

    public void setProductRegularPrice (String ProductRegularPrice)
    {
        this.ProductRegularPrice = ProductRegularPrice;
    }

}
