/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.Author;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Άννα
 */
@Service
public interface AuthorService {

    public List<Author> getAllAuthors();
    
}
