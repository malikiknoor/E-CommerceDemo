package com.iknoortech.e_commercedemo.model.home;

import android.os.Parcel;
import android.os.Parcelable;

public class HomeCategory implements Parcelable {

    private String image;

    private String featuredImage;

    private String id;

    private String title;

    private String parentid;

    private String status;

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getFeaturedImage ()
    {
        return featuredImage;
    }

    public void setFeaturedImage (String featuredImage)
    {
        this.featuredImage = featuredImage;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getParentid ()
    {
        return parentid;
    }

    public void setParentid (String parentid)
    {
        this.parentid = parentid;
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
        return "ClassPojo [image = "+image+", featuredImage = "+featuredImage+", id = "+id+", title = "+title+", parentid = "+parentid+", status = "+status+"]";
    }

    public HomeCategory(Parcel in){
        String[] data = new String[6];

        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.image = data[0];
        this.featuredImage = data[1];
        this.id = data[2];
        this.title = data[3];
        this.parentid = data[4];
        this.status = data[5];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {this.image,
                this.featuredImage,
                this.id,
                this.title,
                this.parentid,
                this.status});
    }

    public static final Creator CREATOR = new Creator() {
        public HomeCategory createFromParcel(Parcel in) {
            return new HomeCategory(in);
        }

        public HomeCategory[] newArray(int size) {
            return new HomeCategory[size];
        }
    };
}
