/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.Customer;
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
public class CustomerDaoImpl implements CustomerDao {
    
     @Autowired
    private SessionFactory  sessionfactory;
    
    private Session getSession(){
    return sessionfactory.getCurrentSession();
    }

    @Override
    public List<Customer> findAll() {
       Query q = getSession().createQuery("Select c From Cusotmer c");
        List<Customer> lista = q.getResultList();
        return lista;
    }

    @Override
    public void createOrUpdate(Customer c) {
        getSession().saveOrUpdate(c);
    }

    @Override
    public void delete(int id) {
         Query q = getSession().createNamedQuery("Customer.deleteById");
        q.setParameter("number", id);
        int result = q.executeUpdate();
    }

    @Override
    public Customer findById(Integer id) {
       return (Customer)getSession().get(Customer.class, id);
    }

    @Override
    public List<Customer> findCustomerbyName(String searchName) {
        Query q = getSession().createNamedQuery("Cusotmer.findLikeName");
        q.setParameter("name", "%"+searchName+"%");
        List<Customer> list = q.getResultList();
        return list;
    }
    
}
