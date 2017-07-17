package com.generalmobile.ecommerce.screens.listeners;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.Product;
import com.generalmobile.ecommerce.models.Subcategory;

import java.util.List;

/**
 * Created by btstajyer7 on 14.07.2017.
 */

public interface AdapterUpdater {
    void updateAdapterForCategories(List<Category> categories);
    void updateAdapterForProducts(List<Product> products);
    void updateAdapterForSubcategories(List<Subcategory> subcategories);
}
