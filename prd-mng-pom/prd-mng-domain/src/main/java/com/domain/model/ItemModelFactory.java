package com.domain.model;

import com.domain.form.ItemCreateForm;
import com.infra.entity.ItemInfoEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.NonNull;
import org.springframework.util.CollectionUtils;

/**
 *アイテム情報モデルファクトリー
 *List<ItemModel> create(List<ItemInfoEntity>)を追加。
 *DBからSELECTで取得したItemInfoEntityのリストをItemModelのリストに変換。
 *(DBのデータを、業務で使用するためのデータに変換ということ)
 *@author Naoto Endo
 */
public class ItemModelFactory {

    @NonNull
    public static ItemModel create(@NonNull final ItemCreateForm form) {
        return new ItemModel(
                form.getItemId(),
                form.getItemName(),
                form.getPrice(),
                null
        );
    }
    
    @NonNull
    public static List<ItemModel> create(@NonNull final List<ItemInfoEntity> entityList) {
        final List<ItemModel> itemModelList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(entityList)) {
            entityList.stream().forEach(entity -> itemModelList.add(new ItemModel(
                    entity.getId(),
                    entity.getName(),
                    entity.getPrice(),
                    null
            )));
        }
            return itemModelList;
    }
}
