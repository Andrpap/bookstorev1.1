/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.Book;
import java.util.List;

/**
 *
 * @author andpa
 */
public interface BookDao {
    
   List<Book> findAll();

    public void createOrUpdate(Book b);

    public void delete(int id);

    public Book findById(Integer id);
    
     public List<Book> findBookbyTitle(String searchName);

}
