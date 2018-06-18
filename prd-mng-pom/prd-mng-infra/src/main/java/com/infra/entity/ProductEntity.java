/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infra.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a26ishibashi
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT u FROM Product u")
    , @NamedQuery(name = "Product.findById", query = "SELECT u FROM Product u WHERE u.productId = :productId")
    , @NamedQuery(name = "Product.findByCd", query = "SELECT u FROM Product u WHERE u.productCd = :productCd")
    , @NamedQuery(name = "Product.findByName", query = "SELECT u FROM Product u WHERE u.productName = :productName")
    , @NamedQuery(name = "Product.findByComment", query = "SELECT u FROM Product u WHERE u.price = :price")
    , @NamedQuery(name = "Product.findByDeletedFlg", query = "SELECT u FROM Product u WHERE u.deletedFlg = :deletedFlg")
    , @NamedQuery(name = "Product.findByVersion", query = "SELECT u FROM Product u WHERE u.version = :version")})
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "productId")
    private String productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "productCd")
    private String productCd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "productName")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Size(max = 6)
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deletedFlg")
    private int deletedFlg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private long version;

    public ProductEntity() {
    }

    public ProductEntity(String productId) {
        this.productId = productId;
    }

    public ProductEntity(String productId, String productCd, String productName, int price, int deletedFlg, long version) {
        this.productId = productId;
        this.productCd = productCd;
        this.productName = productName;
        this.price = price;
        this.deletedFlg = deletedFlg;
        this.version = version;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeletedFlg() {
        return deletedFlg;
    }

    public void setDeletedFlg(int deletedFlg) {
        this.deletedFlg = deletedFlg;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductEntity)) {
            return false;
        }
        ProductEntity other = (ProductEntity) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Product[ productId=" + productId + " ]";
    }

}
