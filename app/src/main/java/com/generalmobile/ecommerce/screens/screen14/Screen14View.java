package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.Product;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface Screen14View {
    void resetAdapter(List<String> categories, List<AtomicInteger> freqData, List<Product> products);
}
