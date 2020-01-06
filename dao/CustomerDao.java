/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.Customer;
import java.util.List;

/**
 *
 * @author andpa
 */

public interface CustomerDao {
    
    List<Customer> findAll();

    public void createOrUpdate(Customer c);

    public void delete(int id);

    public Customer findById(Integer id);
    
     public List<Customer> findCustomerbyName(String searchName);
}
