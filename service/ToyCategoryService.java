/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entities.ToyCategory;
import java.util.List;

/**
 *
 * @author andpa
 */
public interface ToyCategoryService {

    List<ToyCategory> getAllToyCategories();

    public void createOrUpdateToyCategory(ToyCategory bc);

    public void deleteToyCategory(int id);

    public ToyCategory findById(Integer id);

    public List<ToyCategory> findToyByCategory(String searchName);
}
