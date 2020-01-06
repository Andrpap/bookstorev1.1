/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entities.Book;
import com.mycompany.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author andpa
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/list")
    public String showBooks(Model m) {
        List<Book> list = service.getAllBooks();
        m.addAttribute("listofBooks", list);
        return "listBook";

    }
    
       @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("book") Book b){
        return "formBook";
    }
    
   
    @PostMapping("/create")
    public String createOrUpdateBook(Book b){
        service.createOrUpdateBook(b);
        return "redirect:/book/list";
    }
    
    @GetMapping("/delete")
    public String deleteBook(@RequestParam("BookId") int id){
        service.deleteBook(id);
        return "redirect:/book/list";
    }
    
    @GetMapping("/update")
    public String showUpdateForm(
            @RequestParam("BookId") Integer id, Model model
    ){
        Book b = service.findBookById(id);
        model.addAttribute("book", b);
        return "formbook";
    }
    
    @GetMapping("/search")
    public String showBookByTile(
            @RequestParam("searchName") String searchName, Model model){
        List<Book> list = service.findBookByTitle(searchName);
        model.addAttribute("listOfBooks", list);
        return "listBook";
}
}

