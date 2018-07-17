package com.domain.service;

import com.domain.model.ItemModel;
import org.springframework.lang.NonNull;

/**
 *
 * @author Naoto Endo
 */
public interface ItemCreateService {

    void create(@NonNull ItemModel model);

}
