package com.generalmobile.ecommerce.models;

import com.google.gson.annotations.Expose;

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
    private Long id;
    @Expose
    private String name;
    @Expose
    @Property(nameInDb = "PRICE")
    @NotNull
    private double price;
    @Expose
    private Long subCategoryId;
    @Expose
    private Long categoryId;
    @Expose
    @NotNull
    private double rate;
    @Expose
    private String content;
    @Expose
    @Property(nameInDb = "REVIEW")
    @NotNull
    private int review;
    @Expose
    @Property(nameInDb = "TYPE_VARIANT")
    private String typeVariant;
    @Expose
    @Property(nameInDb = "COLOR_VARIANT")
    private String colorVariant;
    @Expose
    @Property(nameInDb = "IMAGE_URL")
    private String imageUrl;
    @Generated(hash = 248932983)
    public Product(Long id, String name, double price, Long subCategoryId,
                   Long categoryId, double rate, String content, int review,
                   String typeVariant, String colorVariant, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.subCategoryId = subCategoryId;
        this.categoryId = categoryId;
        this.rate = rate;
        this.content = content;
        this.review = review;
        this.typeVariant = typeVariant;
        this.colorVariant = colorVariant;
        this.imageUrl = imageUrl;
    }
    @Generated(hash = 1890278724)
    public Product() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
