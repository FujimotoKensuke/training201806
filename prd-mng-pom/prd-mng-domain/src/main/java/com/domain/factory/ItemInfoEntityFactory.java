/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.factory;

import com.domain.model.ItemModel;
import com.infra.entity.ItemInfoEntity;
import org.springframework.lang.NonNull;

/**
 *
 * @author Naoto Endo
 */
public class ItemInfoEntityFactory {
    
    @NonNull
    public static ItemInfoEntity create(@NonNull final ItemModel model) {
        ItemInfoEntity entity = new ItemInfoEntity();
        entity.setId(model.getItemId());
        entity.setName(model.getItemName());
        entity.setPrice(model.getPrice());
        return entity;
    }
}