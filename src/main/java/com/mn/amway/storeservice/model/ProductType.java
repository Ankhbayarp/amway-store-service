package com.mn.amway.storeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name_mn")
    private String nameMn;
    @Column(name = "name_en")
    private String nameEn;

    public ProductType() {

    }

    public ProductType(String nameMn, String nameEn) {
        this.nameMn = nameMn;
        this.nameEn = nameEn;
    }

}