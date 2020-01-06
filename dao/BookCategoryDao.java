/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.BookCategory;
import java.util.List;

/**
 *
 * @author andpa
 */
public interface BookCategoryDao {
    
     List <BookCategory> findAll();

    public void createOrUpdate(BookCategory bc);

    public void delete(int id);

    public BookCategory findById(Integer id);
    
     public List<BookCategory> findBookCategorybyTitle(String searchName);
}
