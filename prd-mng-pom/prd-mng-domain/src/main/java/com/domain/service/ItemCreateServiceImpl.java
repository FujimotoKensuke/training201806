package com.domain.service;

import com.domain.model.ItemModel;
import com.domain.repository.ItemInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Naoto Endo
 */
@Service
public class ItemCreateServiceImpl implements ItemCreateService {

    @Autowired
    private ItemInfoRepository itemInfoRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(@NonNull ItemModel model) {
        itemInfoRepository.insertItem(model);
    }

}
