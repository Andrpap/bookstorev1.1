/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author andpa
 */
public class ToyCategory {

    @Id
    @Column(name="toy_category_id")
    private int toy_category_id;
    @Column(name="toy_title")
    private String toy_title;

    public ToyCategory() {
    }

    public ToyCategory(int toy_category_id, String toy_title) {
        this.toy_category_id = toy_category_id;
        this.toy_title = toy_title;
    }

    public int getToy_category_id() {
        return toy_category_id;
    }

    public void setToy_category_id(int toy_category_id) {
        this.toy_category_id = toy_category_id;
    }

    public String getToy_title() {
        return toy_title;
    }

    public void setToy_title(String toy_title) {
        this.toy_title = toy_title;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.toy_category_id;
        hash = 59 * hash + Objects.hashCode(this.toy_title);
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
        final ToyCategory other = (ToyCategory) obj;
        if (this.toy_category_id != other.toy_category_id) {
            return false;
        }
        if (!Objects.equals(this.toy_title, other.toy_title)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Toy_Category{" + "toy_category_id=" + toy_category_id + ", toy_title=" + toy_title + '}';
    }
    
    
}
