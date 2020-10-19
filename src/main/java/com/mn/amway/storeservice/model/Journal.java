package com.mn.amway.storeservice.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "journal")
public class Journal {

    @Id
    @GeneratedValue
    private Integer id;
    private Date date;
    @Column(name = "product_code")
    private String productCode;
    private Integer income; // orlogo too shirheg
    private Integer expenditure; // zarlaga too shirhed
    @Column(name = "customer_id")
    private Integer customerId;

    public Journal() {

    }

}