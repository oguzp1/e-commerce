package com.generalmobile.ecommerce.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;


/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Entity
public class Product {
    @Id
    @Expose
    @SerializedName("id")
    private Long productId;
    @Expose
    @SerializedName("name")
    private String productName;
    @Expose
    @Property(nameInDb = "PRICE")
    @NotNull
    @SerializedName("price")
    private double price;
    @Expose
    @SerializedName("subCategoryId")
    private Long subCategoryId;
    @Expose
    @SerializedName("categoryId")
    private Long categoryId;
    @Expose
    @NotNull
    @SerializedName("rate")
    private double rate;
    @Expose
    @SerializedName("content")
    private String content;
    @Expose
    @Property(nameInDb = "REVIEW")
    @NotNull
    @SerializedName("review")
    private int review;
    @Expose
    @Property(nameInDb = "TYPE_VARIANT")
    @SerializedName("typeVariant")
    private String typeVariant;
    @Expose
    @Property(nameInDb = "COLOR_VARIANT")
    @SerializedName("colorVariant")
    private String colorVariant;
    @Expose
    @Property(nameInDb = "IMAGE_URL")
    @SerializedName("imageUrl")
    private String productImageUrl;

    @Generated(hash = 781876997)
    public Product(Long productId, String productName, double price,
                   Long subCategoryId, Long categoryId, double rate, String content,
                   int review, String typeVariant, String colorVariant,
                   String productImageUrl) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.subCategoryId = subCategoryId;
        this.categoryId = categoryId;
        this.rate = rate;
        this.content = content;
        this.review = review;
        this.typeVariant = typeVariant;
        this.colorVariant = colorVariant;
        this.productImageUrl = productImageUrl;
    }

    @Generated(hash = 1890278724)
    public Product() {
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getSubCategoryId() {
        return this.subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReview() {
        return this.review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getTypeVariant() {
        return this.typeVariant;
    }

    public void setTypeVariant(String typeVariant) {
        this.typeVariant = typeVariant;
    }

    public String getColorVariant() {
        return this.colorVariant;
    }

    public void setColorVariant(String colorVariant) {
        this.colorVariant = colorVariant;
    }

    public String getProductImageUrl() {
        return this.productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

}
