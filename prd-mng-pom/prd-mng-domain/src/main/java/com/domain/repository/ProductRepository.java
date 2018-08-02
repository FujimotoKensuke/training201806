/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.repository;

import com.domain.model.ProductModel;
import com.infra.entity.ProductEntity;
import java.util.List;

/**
 * 商品情報リポジトリ
 *
 * @author a26ishibashi
 */
public interface ProductRepository {

    void insertProduct(ProductModel model);
    
    void updateProduct(ProductModel model);
    
    List<ProductEntity> selectProductList();
    
    Long selectVersion(ProductModel model);

}
