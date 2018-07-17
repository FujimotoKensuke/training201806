package com.infra.mapper;

import com.infra.entity.ItemInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author Naoto Endo
 */
@Mapper
public interface ItemInfoMapper {
    
    void insert(ItemInfoEntity entity);
}
