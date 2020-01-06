/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entities.Customer;
import com.mycompany.service.CustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author andpa
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    public class BookController {

        @Autowired
        CustomerService service;

        @GetMapping("/list")
        public String showCustomers(Model m) {
            List<Customer> list = service.getAllCustomers();
            m.addAttribute("listofCustomers", list);
            return "listCusotmer";

        }

        @RequestMapping(value = "/create", method = RequestMethod.GET)
        public String showForm(@ModelAttribute("customer") Customer c) {
            return "formBook";
        }

        @PostMapping("/create")
        public String createOrUpdateCustomer(Customer c) {
            service.createOrUpdateCustomer(c);
            return "redirect:/customer /list";
        }

        @GetMapping("/delete")
        public String deleteBook(@RequestParam("CustomerId") int id) {
            service.deleteCustomer(id);
            return "redirect:/customer/list";
        }

        @GetMapping("/update")
        public String showUpdateForm(
                @RequestParam("CustomerId") Integer id, Model model
        ) {
            Customer c = service.findCustomerById(id);
            model.addAttribute("customer", c);
            return "formcustomer";
        }

        @GetMapping("/search")
        public String showCusotmerByName(
                @RequestParam("searchName") String searchName, Model model) {
            List<Customer> list = service.findCustomerByName(searchName);
            model.addAttribute("listOfCustomers", list);
            return "listCustomer";
        }
    }

}
