/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.Book;
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
public class BookDaoImpl implements BookDao{

    @Autowired
    private SessionFactory  sessionfactory;
    
    private Session getSession(){
    return sessionfactory.getCurrentSession();
    }
    
    @Override
    public List <Book> findAll() {
        Query q = getSession().createQuery("Select b From Book b");
        List<Book> list = q.getResultList();
        return list;
        
  
}

    @Override
    public void createOrUpdate(Book b) {
         getSession().saveOrUpdate(b);
    }

    @Override
    public void delete(int id) {
        Query q = getSession().createNamedQuery("Book.deleteById");
        q.setParameter("number", id);
        int result = q.executeUpdate();
    }

    @Override
    public Book findById(Integer id) {
        return (Book)getSession().get(Book.class, id);
         }

    @Override
    public List<Book> findBookbyTitle(String searchName) {
        Query q = getSession().createNamedQuery("Book.findLikeTitle");
        q.setParameter("name", "%"+searchName+"%");
        List<Book> list = q.getResultList();
        return list;
    }
    
}
