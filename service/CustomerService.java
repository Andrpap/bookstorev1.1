/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.Customer;
import java.util.List;

/**
 *
 * @author andpa
 */

public interface CustomerService {
     
        List<Customer> getAllCustomers();

    public void createOrUpdateCustomer(Customer c);

    public void deleteCustomer(int id);

    public Customer findCustomerById(Integer id);

    public List<Customer> findCustomerByName(String searchName);
}
