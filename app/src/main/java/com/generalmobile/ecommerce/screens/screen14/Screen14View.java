package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.models.Category;
import com.generalmobile.ecommerce.models.Product;
import com.generalmobile.ecommerce.repo.DBObserver;

import java.util.List;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface Screen14View {
    void adapterHandler(List<Category> categories);

    void setObserverForDatabase(DBObserver observerForDatabase);
}
