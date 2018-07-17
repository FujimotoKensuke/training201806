/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.repository;


import com.domain.factory.ItemInfoEntityFactory;
import com.domain.model.ItemModel;
import com.infra.entity.ItemInfoEntity;
import com.infra.mapper.ItemInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Naoto Endo
 */
@Repository
public class ItemInfoRepositoryImpl implements ItemInfoRepository{
    
    @Autowired
    private ItemInfoMapper itemInfoMapper;
    
  /**
     * e
     * ユーザー情報登録
     *
     * @param model
     */
    @Override
    public void insertItem(ItemModel modl) {
        ItemInfoEntity entity = ItemInfoEntityFactory.create(model);
  
        
        
        itemInfoMapper.insert(entity);
    }
    
}
