package com.generalmobile.ecommerce;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

@Entity
public class Product {
    @Expose
    @SerializedName("name")
    private String productName;

    @Property(nameInDb = "PRICE")
    @NotNull
    @Expose
    @SerializedName("price")
    private double productPrice;

    private double productRating;

    @Property(nameInDb = "INSTRUCTIONS")
    @Expose
    @SerializedName("instructions")
    private String productDescription;

    private String productTypeVariant;

    private String productColorVariant;

    @Expose
    @SerializedName("category")
    private String productCategory;

    private String productSubcategory;

    @Expose
    @SerializedName("photo")
    private String photoDir;

    @Id(autoincrement = true)
    private Long productID;

    @Generated(hash = 38030855)
    public Product(String productName, double productPrice, double productRating,
            String productDescription, String productTypeVariant,
            String productColorVariant, String productCategory,
            String productSubcategory, String photoDir, Long productID) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.productDescription = productDescription;
        this.productTypeVariant = productTypeVariant;
        this.productColorVariant = productColorVariant;
        this.productCategory = productCategory;
        this.productSubcategory = productSubcategory;
        this.photoDir = photoDir;
        this.productID = productID;
    }

    @Generated(hash = 1890278724)
    public Product() {
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductRating() {
        return this.productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductTypeVariant() {
        return this.productTypeVariant;
    }

    public void setProductTypeVariant(String productTypeVariant) {
        this.productTypeVariant = productTypeVariant;
    }

    public String getProductColorVariant() {
        return this.productColorVariant;
    }

    public void setProductColorVariant(String productColorVariant) {
        this.productColorVariant = productColorVariant;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubcategory() {
        return this.productSubcategory;
    }

    public void setProductSubcategory(String productSubcategory) {
        this.productSubcategory = productSubcategory;
    }

    public String getPhotoDir() {
        return this.photoDir;
    }

    public void setPhotoDir(String photoDir) {
        this.photoDir = photoDir;
    }

    public Long getProductID() {
        return this.productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public void fillProduct() {
        String[] typeVariants = {"A", "B", "C", "D", "E"};
        String[] colorVariants = {"Red", "Blue", "Yellow", "Green", "Pink", "Purple"};
        String[] subcategories = {"Small Shrubs", "Medium Shrubs", "Tall Shrubs"};
        productRating = Math.random() * 5;
        productTypeVariant = typeVariants[(int) (Math.floor(Math.random() * 5))];
        productColorVariant = colorVariants[(int) (Math.floor(Math.random() * 6))];
        productSubcategory = subcategories[(int) (Math.floor(Math.random() * 3))];
    }
}
