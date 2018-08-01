package com.domain.service;

import com.domain.model.ItemModel;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 *アイテム情報一覧取得処理インタフェースとして、getItemList()を追加
 * @author Naoto Endo
 */
public interface ItemService {
    
    //アイテム情報登録処理
    //@param model
    void create(@NonNull ItemModel model);
    
    //アイテム情報一覧取得処理
    //@return
    List<ItemModel> getItemList();    
}
