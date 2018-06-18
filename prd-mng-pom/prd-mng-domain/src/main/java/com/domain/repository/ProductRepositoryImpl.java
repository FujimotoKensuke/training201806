/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.repository;

import com.common.misc.MerchandiseEnum;
import com.domain.factory.ProductEntityFactory;
import com.domain.model.ProductModel;
import com.infra.entity.ProductEntity;
import com.infra.mapper.ProductMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a26ishibashi
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private ProductMapper ProductMapper;

    /**
     * e
     * 商品情報登録
     *
     * @param model
     */
    @Override
    public void insertProduct(ProductModel model) {
        ProductEntity entity = ProductEntityFactory.create(model);
        entity.setDeletedFlg(MerchandiseEnum.DeletedFlg.OFF.getId());
        entity.setVersion(0L);

        ProductMapper.insert(entity);
    }
    
    /**
     * 商品一覧情報取得
     *
     * @return
     */
    @Override
    public List<ProductEntity> selectProductList() {
        return ProductMapper.selectList();
    }

}
