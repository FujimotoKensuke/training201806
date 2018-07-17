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
 * @author Naoto Endo
 */
@Entity
@Table(name = "userinfo")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Userinfo.findAll", query = "SELECT u FROM Userinfo u")
    , @NamedQuery(name = "Userinfo.findById", query = "SELECT u FROM Userinfo u WHERE u.id = :id")
    , @NamedQuery(name = "Userinfo.findByName", query = "SELECT u FROM Userinfo u WHERE u.name = :name")
    , @NamedQuery(name = "Userinfo.findByComment", query = "SELECT u FROM Userinfo u WHERE u.comment = :comment")
    , @NamedQuery(name = "Userinfo.findByDeletedFlg", query = "SELECT u FROM Userinfo u WHERE u.deletedFlg = :deletedFlg")
    , @NamedQuery(name = "Userinfo.findByVersion", query = "SELECT u FROM Userinfo u WHERE u.version = :version")})

public class ItemInfoEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1,max = 12)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1,max = 12)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1,max = 12)
    @Column(name = "price")
    private int price;
    
    public ItemInfoEntity(){        
    }
    
    public ItemInfoEntity(String id){
        this.id = id;
    }
    
        public ItemInfoEntity(String id, String name) {
        this.id = id;
        this.name = name;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

        public void setPrice(int price) {
        this.price = price;
        }
   
        @Override
        public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
        }
    
        @Override
        public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInfoEntity)) {
            return false;
        }
        UserInfoEntity other = (UserInfoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

        @Override
        public String toString() {
        return "entity.Userinfo[ id=" + id + " ]";
    }
        
    }
    