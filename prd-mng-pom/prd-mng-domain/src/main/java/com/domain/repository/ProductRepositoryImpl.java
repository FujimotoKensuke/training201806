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
    private ProductMapper productMapper;

    /**
     * 商品情報登録
     *
     * @param model
     */
    @Override
    public void insertProduct(ProductModel model) {
        ProductEntity entity = ProductEntityFactory.create(model);
        entity.setDeletedFlg(MerchandiseEnum.DeletedFlg.OFF.getId());
        entity.setVersion(0L);
     
        productMapper.insert(entity);
    }
    
    /**
     * 商品情報更新
     *
     * @param model
     */
    @Override
    public void updateProduct(ProductModel model) {
        
        ProductEntity entity = ProductEntityFactory.create(model);
            
        if(productMapper.selectVersion(entity) == entity.getVersion()){
            entity.setDeletedFlg(MerchandiseEnum.DeletedFlg.OFF.getId());
            //versionを1増やす
            entity.setVersion(entity.getVersion() + 1L);
            productMapper.update(entity);
        }else{
            //ここで競合のメッセージ(専用の例外処理がある？)
        }
    }
    
    /**
     * 商品一覧情報取得
     *
     * @return
     */
    @Override
    public List<ProductEntity> selectProductList() {
        return productMapper.selectList();
    }
    
    /**
     * バージョン情報取得
     *
     * @return
     */
    @Override
    public Long selectVersion(ProductModel model) {
        ProductEntity entity = ProductEntityFactory.create(model);
            long version = productMapper.selectVersion(entity);
        return version;
    }

}
