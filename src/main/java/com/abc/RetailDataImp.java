

package com.abc;

import java.util.HashMap;
import java.util.Map;

public class RetailDataImp implements RetailAccessObject {
    private static Map<Integer, RetailModule> store = new HashMap<>();

    @Override
    public void create(RetailModule product) {
        store.put(product.getProduct_id(), product);
    }

    @Override
    public RetailModule read(int productId) {
        return store.get(productId);
    }
}
