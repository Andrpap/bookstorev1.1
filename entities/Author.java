/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Άννα
 */
@Entity(name="Author")
@Table(name="author")
public class Author implements Serializable{
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int author_id;
    private String first_name;
    private String last_name;
    private String author_biography;

    public Author() {
    }

    public Author(int author_id, String first_name, String last_name, String author_biography) {
        this.author_id = author_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.author_biography = author_biography;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
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

    public String getAuthor_biography() {
        return author_biography;
    }

    public void setAuthor_biography(String author_biography) {
        this.author_biography = author_biography;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.author_id;
        hash = 59 * hash + Objects.hashCode(this.first_name);
        hash = 59 * hash + Objects.hashCode(this.last_name);
        hash = 59 * hash + Objects.hashCode(this.author_biography);
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
        final Author other = (Author) obj;
        if (this.author_id != other.author_id) {
            return false;
        }
        if (!Objects.equals(this.first_name, other.first_name)) {
            return false;
        }
        if (!Objects.equals(this.last_name, other.last_name)) {
            return false;
        }
        if (!Objects.equals(this.author_biography, other.author_biography)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Author{" + "author_id=" + author_id + 
                ", first_name=" + first_name + ", last_name=" +
                last_name + ", author_biography=" + author_biography + '}';
    }
    
    
    
}
