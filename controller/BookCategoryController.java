/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entities.BookCategory;
import com.mycompany.service.BookCategoryService;
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
@RequestMapping("/bookCategory")
public class BookCategoryController {
    
    @Autowired
    BookCategoryService service;

    @GetMapping("/list")
    public String showBookCategory(Model m) {
        List<BookCategory> list = service.getAllBookCategories();
        m.addAttribute("listofCategories", list);
        return "listCategories";

    }
    
       @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("bookCategory") BookCategory bc){
        return "formBookCategory";
    }
    
   
    @PostMapping("/create")
    public String createOrUpdateBookCategory(BookCategory bc){
        service.createOrUpdateBookCategory(bc);
        return "redirect:/bookcategory/list";
    }
    
    @GetMapping("/delete")
    public String deleteBookCategory(@RequestParam("BookCtegoryId") int id){
        service.deleteBookCategory(id);
        return "redirect:/bookcategory/list";
    }
    
    @GetMapping("/update")
    public String showUpdateForm(
            @RequestParam("Id") Integer id, Model model
    ){
        BookCategory bc = service.findById(id);
        model.addAttribute("bookcategory", bc);
        return "formbookcategory";
    }
    
  
}

   
