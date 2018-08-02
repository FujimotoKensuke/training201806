/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.factory;

import com.domain.model.ProductModel;
import com.infra.entity.ProductEntity;
import org.springframework.lang.NonNull;

/**
 *
 * @author a26ishibashi
 */
public class ProductEntityFactory {

    @NonNull
    public static ProductEntity create(@NonNull final ProductModel model) {
        ProductEntity entity = new ProductEntity();
        entity.setProductId(model.getProductId());
        entity.setProductCd(model.getProductCd());
        entity.setProductName(model.getProductName());
        entity.setPrice(model.getPrice());
        return entity;
    }
}
