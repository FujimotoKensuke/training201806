package com.domain.service;

import com.domain.model.ItemModel;
import com.domain.model.ItemModelFactory;
import com.domain.repository.ItemInfoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ItemServiceの中身、アイテム情報一覧を取得している。
 * ItemModelFactory.create(List<ItemInfoEntity>)で、ItemModelのListを返却。
 *アイテム情報登録サービスの実装クラス
 * @author Naoto Endo
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemInfoRepository itemInfoRepository;
    
    //アイテム情報登録処理
    //@param model
    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(@NonNull ItemModel model){
        //アイテム情報取得
        itemInfoRepository.insertItem(model);  
    }

    //アイテム情報一覧取得処理
    @Override
    public List<ItemModel> getItemList(){
        //アイテム情報一覧取得
        return ItemModelFactory.create(itemInfoRepository.selectItemList());
    }    
}
