package com.mn.amway.storeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String code;
    @Column(name="type_id")
    private Integer typeId;
    @Column(name="name_mn")
    private String nameMn;
    @Column(name="name_ru")
    private String nameRu;
    private Double price0;
    private Double price1;    
    private Double price2;
    private Double score;
    // private Integer income;   // orlogo too shirheg
    // private Integer expenditure;  // zarlaga too shirhed
    private Integer balance;  // vldegdel

    public Product() {

    }


}