/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.form;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.lang.Nullable;

/**
 *
 * @author a26ishibashi
 */
public class RegistrationForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Nullable
    @Min(1)
    @Max(9999)
    private Integer productId;
    
    @NotNull(message="商品コードは1文字以上6文字以下で入力してください。")
    @Size(min = 1, max = 6,message="商品コードは1文字以上6文字以下で入力してください。")
    private String productCd;

    @NotNull(message="商品名は1文字以上20文字以下で入力してください。")
    @Size(min = 1, max = 20,message="商品名は1文字以上20文字以下で入力してください。")
    private String productName;

    @NotNull(message="価格は1桁以上6桁以下の半角数字で入力して下さい。")
    @Min(value=1,message="価格は1桁以上6桁以下の半角数字で入力して下さい。")
    @Max(value=999999,message="価格は1桁以上6桁以下の半角数字で入力して下さい。")
    private Integer price;
    
    @NotNull
    private long version;

    /**
     * @return the productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    /**
     * @return the productCd
     */
    public String getProductCd() {
        return productCd;
    }

    /**
     * @param productCd the productCd to set
     */
    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return the version
     */
    public long getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(long version) {
        this.version = version;
    }
}