package com.generalmobile.ecommerce.screens;

import com.generalmobile.ecommerce.models.Category;

import java.util.List;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface ApiListener {
    void onFinish(List<Category> categories);
}
