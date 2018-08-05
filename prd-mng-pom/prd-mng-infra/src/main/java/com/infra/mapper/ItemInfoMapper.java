package com.infra.mapper;

import com.infra.entity.ItemInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 *
 *DBからユーザー情報一覧取得を行うインタフェース。
　List<ItemInfoEntity> selectList();を追加。
 * @author Naoto Endo
 */
@Mapper
public interface ItemInfoMapper {
    
    void insert(ItemInfoEntity entity);
    
    void update(ItemInfoEntity entity);
    
    List<ItemInfoEntity> selectList();
    
    ItemInfoEntity selectForUpdate(ItemInfoEntity entity);
}
