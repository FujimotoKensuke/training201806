/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.model;

import com.common.misc.MerchandiseEnum;
import java.io.Serializable;

/**
 * ユーザー情報モデル
 *
 * @author a26ishibashi
 */
public class ProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ユーザーID
     */
    private final String productId;
    
    /**
     * ユーザーID
     */
    private final String productCd;

    /**
     * ユーザー名
     */
    private final String productName;

    /**
     * コメント
     */
    private final int price;

    /**
     * 削除フラグ
     */
    private final MerchandiseEnum.DeletedFlg deletedFlg;

    /**
     * バージョン
     */
    private final Long version;

    public ProductModel(
            String productId,
            String productCd,
            String productName,
            int price,
            MerchandiseEnum.DeletedFlg deletedFlg,
            Long version) {
        this.productId = productId;
        this.productCd = productCd;
        this.productName = productName;
        this.price = price;
        this.deletedFlg = deletedFlg;
        this.version = version;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }
    
    /**
     * @return the productCd
     */
    public String getProductCd() {
        return productCd;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the deletedFlg
     */
    public MerchandiseEnum.DeletedFlg getDeletedFlg() {
        return deletedFlg;
    }

    /**
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

}
