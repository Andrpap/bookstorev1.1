/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entities.ToyCategory;
import com.mycompany.service.ToyCategoryService;
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
@RequestMapping("/ToyCategory")
public class ToyCategoryController {

    @Autowired
   ToyCategoryService service;
    
    @GetMapping("/list")
    public String showToyCategory(Model m) {
        List<ToyCategory> lista = service.getAllToyCategories();
        m.addAttribute("listofCategories", lista);
        return "listCategories";

    }
    
       @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("ToyCategory") ToyCategory tc){
        return "formToyCategory";
    }
    
   
    @PostMapping("/create")
    public String createOrUpdateToyCategory(ToyCategory tc){
        service.createOrUpdateToyCategory(tc);
        return "redirect:/toycategory/list";
    }
    
    @GetMapping("/delete")
    public String deleteBookCategory(@RequestParam("toyCategoryId") int id){
        service.deleteToyCategory(id);
        return "redirect:/toytcategory/list";
    }
    
    @GetMapping("/update")
    public String showUpdateForm(
            @RequestParam("Id") Integer id, Model model
    ){
        ToyCategory tc = service.findById(id);
        model.addAttribute("toycategory", tc);
        return "formtoycategory";
    }
}
