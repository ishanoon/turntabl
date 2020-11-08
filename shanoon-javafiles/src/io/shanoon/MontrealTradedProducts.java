package io.shanoon;

import java.util.HashMap;
import java.util.Map;

public interface MontrealTradedProducts {

    Map<Products, Integer> Products = new HashMap<>();

    void addNewProduct(Products product);
    

}
