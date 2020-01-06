/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author andpa
 */
@Entity(name="Cusotmer")
@Table(name="customer")
@NamedQueries({
    @NamedQuery(name = "Customer.deleteById", query = "DELETE FROMCustomer c WHERE c.customer_id =:number"),
    @NamedQuery(name = "Book.findLikeName", query = "SELECT cb FROM Customer cWHERE c.last_name LIKE :name")
})
public class Customer implements Serializable {
 @Id   
 @Column(name="customer_id")
private int customer_id;
 @Column(name="first_name")
private String first_name;
 @Column(name="last_name")
private String last_name;
 @Column(name="mobile_phone")
private String mobile_phone;
 @Column(name="telephone_number")
private String telephone_number;
 @OneToOne(fetch = FetchType.LAZY)
 @JoinColumn(name="address_id",referencedColumnName = "address_id")
private int address_id;
@OneToOne(fetch = FetchType.LAZY)
 @JoinColumn(name="address_id",referencedColumnName = "address_id")
private int address2_id;

    public Customer() {
    }

    public Customer(int customer_id, String first_name, String last_name, String mobile_phone, String telephone_number, int address_id, int address2_id) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile_phone = mobile_phone;
        this.telephone_number = telephone_number;
        this.address_id = address_id;
        this.address2_id = address2_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getAddress2_id() {
        return address2_id;
    }

    public void setAddress2_id(int address2_id) {
        this.address2_id = address2_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.customer_id;
        hash = 79 * hash + Objects.hashCode(this.first_name);
        hash = 79 * hash + Objects.hashCode(this.last_name);
        hash = 79 * hash + Objects.hashCode(this.mobile_phone);
        hash = 79 * hash + Objects.hashCode(this.telephone_number);
        hash = 79 * hash + this.address_id;
        hash = 79 * hash + this.address2_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.customer_id != other.customer_id) {
            return false;
        }
        if (this.address_id != other.address_id) {
            return false;
        }
        if (this.address2_id != other.address2_id) {
            return false;
        }
        if (!Objects.equals(this.first_name, other.first_name)) {
            return false;
        }
        if (!Objects.equals(this.last_name, other.last_name)) {
            return false;
        }
        if (!Objects.equals(this.mobile_phone, other.mobile_phone)) {
            return false;
        }
        if (!Objects.equals(this.telephone_number, other.telephone_number)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", mobile_phone=" + mobile_phone + ", telephone_number=" + telephone_number + ", address_id=" + address_id + ", address2_id=" + address2_id + '}';
    }
    

}

