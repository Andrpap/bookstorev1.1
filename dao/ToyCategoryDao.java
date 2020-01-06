/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entities.ToyCategory;
import java.util.List;

/**
 *
 * @author andpa
 */
public interface ToyCategoryDao {
    
    List <ToyCategory> findAll();

    public void createOrUpdate(ToyCategory tc);

    public void delete(int id);

    public ToyCategory findById(Integer id);
    
     public List<ToyCategory> findToyCategorybyTitle(String searchName);
}

