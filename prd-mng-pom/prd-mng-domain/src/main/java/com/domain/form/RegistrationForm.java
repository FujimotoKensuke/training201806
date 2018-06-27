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
    
    @NotNull
    @Size(min = 1, max = 6)
    private String productCd;

    @NotNull
    @Size(min = 1, max = 20)
    private String productName;

    @NotNull
    @Min(1)
    @Max(999999)
    private Integer price;

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
}
