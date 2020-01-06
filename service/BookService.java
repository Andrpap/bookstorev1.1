/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.Book;
import java.util.List;

/**
 *
 * @author andpa
 */

public interface BookService {
    
    List<Book> getAllBooks();

    public void createOrUpdateBook(Book b);

    public void deleteBook(int id);

    public Book findBookById(Integer id);

    public List<Book> findBookByTitle(String searchName);
    
  
    
}
