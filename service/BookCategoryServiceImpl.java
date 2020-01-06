/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.BookCategoryDao;
import com.mycompany.entities.BookCategory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author andpa
 */
@Service
@Transactional
public class BookCategoryServiceImpl implements BookCategoryService{
    
    @Autowired
    BookCategoryDao bcdao;

    @Override
    public List<BookCategory> getAllBookCategories() {
     return  bcdao.findAll();
    }

    @Override
    public void createOrUpdateBookCategory(BookCategory bc) {
     bcdao.createOrUpdate(bc);
    }

    @Override
    public void deleteBookCategory(int id) {
       bcdao.delete(id);
    }

    @Override
    public BookCategory findById(Integer id) {
          return bcdao.findById(id);
    }

    @Override
    public List<BookCategory> findBookByCategory(String searchName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
