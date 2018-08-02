package com.domain.model;

import com.common.misc.MerchandiseEnum;
import com.domain.form.RegistrationForm;
import com.infra.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.NonNull;
import org.springframework.util.CollectionUtils;

/**
 * 商品情報モデルファクトリー
 *
 * @author a26ishibashi
 */
public class ProductModelFactory {

    @NonNull
    public static ProductModel create(@NonNull final RegistrationForm form) {
        return new ProductModel(
                form.getProductId(),
                form.getProductCd(),
                form.getProductName(),
                form.getPrice(),
                null,
                null
        );
    }
    
    @NonNull
    public static List<ProductModel> create(@NonNull final List<ProductEntity> entityList) {
        final List<ProductModel> productModelList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(entityList)) {
            entityList.stream().forEach(entity -> productModelList.add(new ProductModel(
                    entity.getProductId(),
                    entity.getProductCd(),
                    entity.getProductName(),
                    entity.getPrice(),
                    MerchandiseEnum.DeletedFlg.valueOf(entity.getDeletedFlg()),
                    entity.getVersion()
            )));
        }
        return productModelList;
    }
}
