/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.model;

import java.io.Serializable;

/**
 * アイテム情報モデル
 *
 * @author Naoto Endo
 */
public class ItemModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * アイテムコード
     */
    private final String itemId;

    /**
     * アイテム名
     */
    private final String itemName;

    /**
     * 値段
     */
    private final int price;

    public ItemModel(
            String itemId,
            String itemName,
            int price,
            Long version) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    /**
     * @return the itemCode
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

}
