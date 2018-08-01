package com.domain.service;

import com.domain.model.ItemModel;
import org.springframework.lang.NonNull;

/**
 *
 * @author Naoto Endo
 */
public interface ItemCreateService {
    
    
        /**
     * アイテム情報登録処理
     *
     * @param model
     */

    void create(@NonNull ItemModel model);

}
