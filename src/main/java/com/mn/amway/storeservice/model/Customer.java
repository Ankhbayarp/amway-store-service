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
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;    
    @Column(name="last_name")
    private String lastName;    
    @Column(name="first_name")
    private String firstName;
    @Column(name="register_no")
    private String registerNo;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;

    public Customer() {

    }


}