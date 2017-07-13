package com.generalmobile.ecommerce.models;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
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
    private Long id;
    @Expose
    private String name;
    @Expose
    private int productCount;
    @Expose
    @Property(nameInDb = "IMAGE_URL")
    private String imageUrl;
    @Generated(hash = 793674817)
    public Category(Long id, String name, int productCount, String imageUrl) {
        this.id = id;
        this.name = name;
        this.productCount = productCount;
        this.imageUrl = imageUrl;
    }

    @Generated(hash = 1150634039)
    public Category() {
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

    public int getProductCount() {
        return this.productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
