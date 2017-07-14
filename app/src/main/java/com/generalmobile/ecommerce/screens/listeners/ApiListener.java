package com.generalmobile.ecommerce.screens.listeners;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.Product;

import java.util.List;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface ApiListener {
    boolean onFinish(List<Category> categories);
}
