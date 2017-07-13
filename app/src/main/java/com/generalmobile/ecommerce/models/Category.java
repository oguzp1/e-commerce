package com.generalmobile.ecommerce.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by btstajyer7 on 12.07.2017.
 */

@Entity
public class Category {
    @Expose
    @Id
    @SerializedName("id")
    private Long categoryId;
    @Expose
    @SerializedName("name")
    private String categoryName;
    @Expose
    @SerializedName("productCount")
    private int productCount;
    @Expose
    @Property(nameInDb = "IMAGE_URL")
    @SerializedName("imageUrl")
    private String catgoryImageUrl;

    @Generated(hash = 719866306)
    public Category(Long categoryId, String categoryName, int productCount,
                    String catgoryImageUrl) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.productCount = productCount;
        this.catgoryImageUrl = catgoryImageUrl;
    }

    @Generated(hash = 1150634039)
    public Category() {
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProductCount() {
        return this.productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getCatgoryImageUrl() {
        return this.catgoryImageUrl;
    }

    public void setCatgoryImageUrl(String catgoryImageUrl) {
        this.catgoryImageUrl = catgoryImageUrl;
    }
}
