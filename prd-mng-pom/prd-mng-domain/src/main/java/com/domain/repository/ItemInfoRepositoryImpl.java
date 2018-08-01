package com.domain.repository;

import com.domain.factory.ItemInfoEntityFactory;
import com.domain.model.ItemModel;
import com.infra.entity.ItemInfoEntity;
import com.infra.mapper.ItemInfoMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *ItemInfoRepository.javaの中身、itemInfoMapperのselectList()でSQL(SELECT文)を発行した結果を返却するのみ。
 * @author Naoto Endo
 */
@Repository
public class ItemInfoRepositoryImpl  implements ItemInfoRepository {

    @Autowired
    private ItemInfoMapper itemInfoMapper;

    /**
     * アイテム情報登録
     * @param model
     */
    @Override
    public void insertItem(ItemModel model) {
        ItemInfoEntity entity = ItemInfoEntityFactory.create(model);
        
        itemInfoMapper.insert(entity);
    }
    
        /**
     * アイテム一覧情報登録
     * @return
     */
    @Override
    public List<ItemInfoEntity> selectItemList(){
        return itemInfoMapper.selectList();
    }    
}
