package com.iknoortech.e_commercedemo.model.productDetail;

public class ProductDetailPojo {
    private String status_code;

    private String ProductName;

    private boolean wishlist;

    private String ProductRegularPrice;

    private String ProductOfferPrice;

    private String ProductWeight;

    private String message;

    private boolean cart;

    private String ProductImage1;

    private String ProductImage2;

    private String totalQuantity;

    private String ProductImage3;

    private String imageBaseUrl;

    private String ProductDescription;

    private String ProductImage4;

    private String ProductImage5;

    private String cartQuantity;

    public String getProductOfferPrice() {
        return ProductOfferPrice;
    }

    public void setProductOfferPrice(String productOfferPrice) {
        ProductOfferPrice = productOfferPrice;
    }

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public String getProductName ()
    {
        return ProductName;
    }

    public void setProductName (String ProductName)
    {
        this.ProductName = ProductName;
    }

    public boolean isWishlist ()
    {
        return wishlist;
    }

    public void setWishlist (boolean wishlist)
    {
        this.wishlist = wishlist;
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

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public boolean isCart ()
    {
        return cart;
    }

    public void setCart (boolean cart)
    {
        this.cart = cart;
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

    public String getTotalQuantity ()
    {
        return totalQuantity;
    }

    public void setTotalQuantity (String totalQuantity)
    {
        this.totalQuantity = totalQuantity;
    }

    public String getProductImage3 ()
    {
        return ProductImage3;
    }

    public void setProductImage3 (String ProductImage3)
    {
        this.ProductImage3 = ProductImage3;
    }

    public String getImageBaseUrl ()
    {
        return imageBaseUrl;
    }

    public void setImageBaseUrl (String imageBaseUrl)
    {
        this.imageBaseUrl = imageBaseUrl;
    }

    public String getProductDescription ()
    {
        return ProductDescription;
    }

    public void setProductDescription (String ProductDescription)
    {
        this.ProductDescription = ProductDescription;
    }

    public String getProductImage4 ()
    {
        return ProductImage4;
    }

    public void setProductImage4 (String ProductImage4)
    {
        this.ProductImage4 = ProductImage4;
    }

    public String getProductImage5 ()
    {
        return ProductImage5;
    }

    public void setProductImage5 (String ProductImage5)
    {
        this.ProductImage5 = ProductImage5;
    }

    public String getCartQuantity ()
    {
        return cartQuantity;
    }

    public void setCartQuantity (String cartQuantity)
    {
        this.cartQuantity = cartQuantity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [status_code = "+status_code+", ProductName = "+ProductName+", wishlist = "+wishlist+", ProductRegularPrice = "+ProductRegularPrice+", ProductWeight = "+ProductWeight+", message = "+message+", cart = "+cart+", ProductImage1 = "+ProductImage1+", ProductImage2 = "+ProductImage2+", totalQuantity = "+totalQuantity+", ProductImage3 = "+ProductImage3+", imageBaseUrl = "+imageBaseUrl+", ProductDescription = "+ProductDescription+", ProductImage4 = "+ProductImage4+", ProductImage5 = "+ProductImage5+", cartQuantity = "+cartQuantity+"]";
    }
}
