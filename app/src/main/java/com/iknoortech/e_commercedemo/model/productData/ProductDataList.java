package com.iknoortech.e_commercedemo.model.productData;

import android.os.Parcel;
import android.os.Parcelable;

public class ProductDataList implements Parcelable {

    private String ProductName;

    private String ProductRegularPrice;

    private String ProductOfferPrice;

    private String ProductWeight;

    private String ProductImage1;

    private String ProductImage2;

    private String ProductFeatures;

    private String ProductImage3;

    private String id;

    private String ProductMainCategory;

    private String ProductDescription;

    private String sku;

    private String ProductImage4;

    private String ProductStock;

    private String ProductImage5;

    private String status;

    private int itemQuantityLeft;

    private boolean IsCart;

    private boolean IsWishList;

    private boolean itemQuantityAvailable;

    public ProductDataList(Parcel in) {
        ProductName = in.readString();
        ProductRegularPrice = in.readString();
        ProductOfferPrice = in.readString();
        ProductWeight = in.readString();
        ProductImage1 = in.readString();
        ProductImage2 = in.readString();
        ProductFeatures = in.readString();
        ProductImage3 = in.readString();
        id = in.readString();
        ProductMainCategory = in.readString();
        ProductDescription = in.readString();
        sku = in.readString();
        ProductImage4 = in.readString();
        ProductStock = in.readString();
        ProductImage5 = in.readString();
        status = in.readString();
        itemQuantityLeft = in.readInt();
        IsCart = in.readByte() != 0;
        IsWishList = in.readByte() != 0;
        itemQuantityAvailable = in.readByte() != 0;
    }

    public int getItemQuantityLeft() {
        return itemQuantityLeft;
    }

    public void setItemQuantityLeft(int itemQuantityLeft) {
        this.itemQuantityLeft = itemQuantityLeft;
    }

    public boolean isItemQuantityAvailable() {
        return itemQuantityAvailable;
    }

    public void setItemQuantityAvailable(boolean itemQuantityAvailable) {
        this.itemQuantityAvailable = itemQuantityAvailable;
    }

    public String getProductOfferPrice() {
        return ProductOfferPrice;
    }

    public void setProductOfferPrice(String productOfferPrice) {
        ProductOfferPrice = productOfferPrice;
    }

    public boolean isCart() {
        return IsCart;
    }

    public void setCart(boolean cart) {
        IsCart = cart;
    }

    public boolean isWishList() {
        return IsWishList;
    }

    public void setWishList(boolean wishList) {
        IsWishList = wishList;
    }

    public String getProductName ()
    {
        return ProductName;
    }

    public void setProductName (String ProductName)
    {
        this.ProductName = ProductName;
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

    public String getProductFeatures ()
    {
        return ProductFeatures;
    }

    public void setProductFeatures (String ProductFeatures)
    {
        this.ProductFeatures = ProductFeatures;
    }

    public String getProductImage3 ()
    {
        return ProductImage3;
    }

    public void setProductImage3 (String ProductImage3)
    {
        this.ProductImage3 = ProductImage3;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getProductMainCategory ()
    {
        return ProductMainCategory;
    }

    public void setProductMainCategory (String ProductMainCategory)
    {
        this.ProductMainCategory = ProductMainCategory;
    }

    public String getProductDescription ()
    {
        return ProductDescription;
    }

    public void setProductDescription (String ProductDescription)
    {
        this.ProductDescription = ProductDescription;
    }

    public String getSku ()
    {
        return sku;
    }

    public void setSku (String sku)
    {
        this.sku = sku;
    }

    public String getProductImage4 ()
    {
        return ProductImage4;
    }

    public void setProductImage4 (String ProductImage4)
    {
        this.ProductImage4 = ProductImage4;
    }

    public String getProductStock ()
    {
        return ProductStock;
    }

    public void setProductStock (String ProductStock)
    {
        this.ProductStock = ProductStock;
    }

    public String getProductImage5 ()
    {
        return ProductImage5;
    }

    public void setProductImage5 (String ProductImage5)
    {
        this.ProductImage5 = ProductImage5;
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
        return "ClassPojo [ProductName = "+ProductName+", ProductRegularPrice = "+ProductRegularPrice+", ProductWeight = "+ProductWeight+", ProductImage1 = "+ProductImage1+", ProductImage2 = "+ProductImage2+", ProductFeatures = "+ProductFeatures+", ProductImage3 = "+ProductImage3+", id = "+id+", ProductMainCategory = "+ProductMainCategory+", ProductDescription = "+ProductDescription+", sku = "+sku+", ProductImage4 = "+ProductImage4+", ProductStock = "+ProductStock+", ProductImage5 = "+ProductImage5+", status = "+status+"]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ProductName);
        parcel.writeString(ProductRegularPrice);
        parcel.writeString(ProductOfferPrice);
        parcel.writeString(ProductWeight);
        parcel.writeString(ProductImage1);
        parcel.writeString(ProductImage2);
        parcel.writeString(ProductFeatures);
        parcel.writeString(ProductImage3);
        parcel.writeString(id);
        parcel.writeString(ProductMainCategory);
        parcel.writeString(ProductDescription);
        parcel.writeString(sku);
        parcel.writeString(ProductImage4);
        parcel.writeString(ProductStock);
        parcel.writeString(ProductImage5);
        parcel.writeString(status);
        parcel.writeInt(itemQuantityLeft);
        parcel.writeByte((byte) (IsCart ? 1 : 0));
        parcel.writeByte((byte) (IsWishList ? 1 : 0));
        parcel.writeByte((byte) (itemQuantityAvailable ? 1 : 0));
    }

    public static final Creator CREATOR = new Creator() {
        public ProductDataList createFromParcel(Parcel in) {
            return new ProductDataList(in);
        }

        public ProductDataList[] newArray(int size) {
            return new ProductDataList[size];
        }
    };
}
