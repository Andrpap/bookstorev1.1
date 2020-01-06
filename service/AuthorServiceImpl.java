/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.AuthorDao;
import com.mycompany.entities.Author;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Άννα
 */
@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{
    
    @Autowired
    AuthorDao adao;

    @Override
    public List<Author> getAllAuthors() {
        return adao.findAll();
        
    }
    
}
