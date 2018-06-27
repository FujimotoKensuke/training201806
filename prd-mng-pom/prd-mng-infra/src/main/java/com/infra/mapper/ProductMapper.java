package com.infra.mapper;

import com.infra.entity.ProductEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author a26ishibashi
 */
@Mapper
public interface ProductMapper {

    void insert(ProductEntity entity);
    
    void update(ProductEntity entity);
    
     java.util.List<ProductEntity> selectList();
}
