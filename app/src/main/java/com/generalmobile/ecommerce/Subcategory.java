package com.generalmobile.ecommerce;

import com.google.gson.annotations.Expose;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by btstajyer7 on 12.07.2017.
 */

@Entity
public class Subcategory {
    @Expose
    @Id
    private Long id;
    @Expose
    private String name;
    @Expose
    private Long categoryId;

    @Generated(hash = 116531778)
    public Subcategory(Long id, String name, Long categoryId) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
    }

    @Generated(hash = 1953416725)
    public Subcategory() {
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

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}
