/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.BookDao;
import com.mycompany.entities.Book;
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
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bdao;

    @Override
    public List<Book> getAllBooks() {
         return bdao.findAll();
    }

    @Override
    public void createOrUpdateBook(Book b) {
        bdao.createOrUpdate(b);
    }

    @Override
    public void deleteBook(int id) {
        bdao.delete(id);
    }

    @Override
    public Book findBookById(Integer id) {
      return bdao.findById(id);
    }

    @Override
    public List<Book> findBookByTitle(String searchName) {
        List<Book> list = bdao. findBookbyTitle(searchName);
        return list;
    }

    

}
