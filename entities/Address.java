/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author andpa
 */
public class Address {

    @Id
    @Column(name = "address_id")
    private int address_id;
    @Column(name = "street")
    private String street;
    @Column(name = "street_number")
    private String street_number;
    @Column(name = "city")
    private String city;
    @Column(name = "zip_code")
    private int zip_code;
}
