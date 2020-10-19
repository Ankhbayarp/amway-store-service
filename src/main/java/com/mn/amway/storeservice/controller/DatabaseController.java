package com.mn.amway.storeservice.controller;

import java.util.List;
import com.mn.amway.storeservice.service.CatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class DatabaseController {

    @Autowired
    private CatalogService catalogService;

//     @GetMapping("/")
//     public List<Catalog> getCatalog() {
//         return catalogService.findByCatalog();

//     }
}