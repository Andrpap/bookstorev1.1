/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.CustomerDao;
import com.mycompany.entities.Customer;
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
public class CustomerServiceImpl implements CustomerService{
    
    
    @Autowired
    CustomerDao cdao;

    @Override
    public List<Customer> getAllCustomers() {
        return cdao.findAll();
    }

    @Override
    public void createOrUpdateCustomer(Customer c) {
        cdao.createOrUpdate(c);
    }

    @Override
    public void deleteCustomer(int id) {
        cdao.delete(id);
    }

    @Override
    public Customer findCustomerById(Integer id) {
     return  cdao.findById(id);
    }

    @Override
    public List<Customer> findCustomerByName(String searchName) {
    List<Customer> list = cdao. findCustomerbyName(searchName);
        return list;
    }
    
}
