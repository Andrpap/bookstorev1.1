/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.BookCategory;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andpa
 */
@Repository
public class BookCategoryDaoImpl implements BookCategoryDao {

    
    
    @Autowired
    private SessionFactory  sessionfactory;
    
    private Session getSession(){
    return sessionfactory.getCurrentSession();
    }
    
    
    @Override
    public List<BookCategory> findAll() {
        Query q = getSession().createQuery("Select bc From BookCategory bc");
        List<BookCategory> list = q.getResultList();
        return list;
    }

    @Override
    public void createOrUpdate(BookCategory bc) {
        getSession().saveOrUpdate(bc);
    }

    @Override
    public void delete(int id) {
       
    }

    @Override
    public BookCategory findById(Integer id) {
        return (BookCategory)getSession().get(BookCategory.class, id);
    }

    @Override
    public List<BookCategory> findBookCategorybyTitle(String searchName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
