/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.BookCategory;
import java.util.List;

/**
 *
 * @author andpa
 */

public interface BookCategoryService {

    List<BookCategory> getAllBookCategories();

    public void createOrUpdateBookCategory(BookCategory bc);

    public void deleteBookCategory(int id);

    public BookCategory findById(Integer id);

    public List<BookCategory> findBookByCategory(String searchName);
}
