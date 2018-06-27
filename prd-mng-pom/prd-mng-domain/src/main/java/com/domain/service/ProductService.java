/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.model.ProductModel;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 * 商品情報登録サービスのインタフェース
 *
 * @author a26ishibashi
 */
public interface ProductService {

    /**
     * 商品情報登録処理
     *
     * @param model
     */
    void create(@NonNull ProductModel model);
    
    /**
     * 商品情報登録処理
     *
     * @param model
     */
    void update(@NonNull ProductModel model);
    
    /**
     * 商品情報一覧取得処理
     *
     * @return
     */
    List<ProductModel> getProductList();

}
