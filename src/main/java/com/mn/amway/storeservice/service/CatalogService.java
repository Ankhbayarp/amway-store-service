package com.mn.amway.storeservice.service;

import java.util.List;

import com.mn.amway.storeservice.model.ProductType;
import com.mn.amway.storeservice.repository.ProductTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    @Autowired
    private ProductTypeRepository productTypeRepository;
   public List<ProductType> findByCatalog () {
       return productTypeRepository.findAll();
   }

}