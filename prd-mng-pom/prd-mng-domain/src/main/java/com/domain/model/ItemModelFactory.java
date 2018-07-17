package com.domain.model;

import com.domain.form.ItemCreateForm;
import org.springframework.lang.NonNull;

/**
 *
 * @author Naoto Endo
 */
public class ItemModelFactory {
    
    @NonNull
    public static ItemModel create(@NonNull final ItemCreateForm form){
        return new ItemModel(
                form.getItemId(),
                form.getItemName(),
                form.getPrice(),
                null,
                null
        );
    }    
}
