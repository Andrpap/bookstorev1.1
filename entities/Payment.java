/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author andpa
 */
@Entity
public class Payment {
@Id
@Column(name="payment_id")
    private int payment_id;
    private int payment_customer_id;
    private int payment_category_id;
    private double amount;
    private LocalDateTime payment_date;

}
