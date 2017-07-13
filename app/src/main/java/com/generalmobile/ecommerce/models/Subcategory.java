package com.generalmobile.ecommerce.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by btstajyer7 on 12.07.2017.
 */

@Entity
public class Subcategory {
    @Expose
    @Id
    @SerializedName("id")
    private Long subCategoryId;
    @Expose
    @SerializedName("name")
    private String subCategoryName;
    @Expose
    @SerializedName("categoryId")
    private Long categoryId;

    @Generated(hash = 497785927)
    public Subcategory(Long subCategoryId, String subCategoryName,
                       Long categoryId) {
        this.subCategoryId = subCategoryId;
        this.subCategoryName = subCategoryName;
        this.categoryId = categoryId;
    }

    @Generated(hash = 1953416725)
    public Subcategory() {
    }

    public Long getSubCategoryId() {
        return this.subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return this.subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}
