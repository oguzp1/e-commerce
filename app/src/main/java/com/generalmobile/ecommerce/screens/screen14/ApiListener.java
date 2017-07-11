package com.generalmobile.ecommerce.screens.screen14;

import com.generalmobile.ecommerce.Product;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by btstajyer7 on 11.07.2017.
 */

public interface ApiListener {
    void onFinish(List<String> categories, List<AtomicInteger> freqData, List<Product> products);
}
