/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.model.ProductModel;
import com.domain.model.ProductModelFactory;
import com.domain.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品情報登録サービスの実装クラス
 *
 * @author a26ishibashi
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * 商品情報登録処理
     *
     * @param model
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(@NonNull ProductModel model) {
        // ユーザー情報登録
        productRepository.insertProduct(model);
    }
    
    /**
     * 商品情報登録処理
     *
     * @param model
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(@NonNull ProductModel model) {
        // ユーザー情報登録
        productRepository.updateProduct(model);
    }
    
    /**
     * 商品情報一覧取得処理
     *
     */
    @Override
    public List<ProductModel> getProductList() {
        // 商品情報一覧取得
        return ProductModelFactory.create(productRepository.selectProductList());
    }
       
}
