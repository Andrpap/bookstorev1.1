/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.ToyCategoryDao;
import com.mycompany.entities.ToyCategory;
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
public class ToyCategoryServiceImpl implements ToyCategoryService {

    @Autowired
    ToyCategoryDao tcdao;

    @Override
    public List<ToyCategory> getAllToyCategories() {
        return  tcdao.findAll();
    }

    @Override
    public void createOrUpdateToyCategory(ToyCategory tc) {
       tcdao.createOrUpdate(tc);
    }

    @Override
    public void deleteToyCategory(int id) { 
        tcdao.delete(id);}
      

    @Override
    public ToyCategory findById(Integer id) {
      return tcdao.findById(id);
    }

    @Override
    public List<ToyCategory> findToyByCategory(String searchName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
