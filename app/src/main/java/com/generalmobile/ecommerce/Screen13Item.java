package com.generalmobile.ecommerce;

/**
 * Created by MONSTER on 10.7.2017.
 */

public class Screen13Item {
    private int imgSrc;
    private int productName;
    private int productPrice;
    private int itemsOrdered;

    public Screen13Item() {
        imgSrc = R.drawable.mountains;
        productName = R.string.default_product_name;
        productPrice = 100;
        itemsOrdered = R.string.default_product_quantity;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public int getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getItemsOrdered() {
        return itemsOrdered;
    }
}
