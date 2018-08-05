package com.domain.repository;

import com.domain.model.ItemModel;
import com.infra.entity.ItemInfoEntity;
import java.util.List;

/**
 *アイテム情報一覧取得処理インタフェースとして、selectItemList()を追加。
 *アイテム情報リポジトリ
 * @author Naoto Endo
 */
public interface ItemInfoRepository {
    
    void insertItem(ItemModel model);
    
    void updateItem(ItemModel model)throws Exception;
    
    List<ItemInfoEntity> selectItemList();
}
