package com.javatechie.kb.api.controller;

import com.javatechie.kb.api.entity.Katalog;
import com.javatechie.kb.api.service.KatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/katalog")
public class KatalogController {

    @Autowired
    private KatalogService service;

    @PostMapping("/addKatalog")
    public Katalog addKatalog(@RequestBody Katalog katalog) {
        return service.saveKatalog(katalog);
    }

    @GetMapping("/product/{id}")
    private Katalog getCatalog(@PathVariable("id") int id)
    {
        return service.getProductById(id);
    }

    @GetMapping("/all")
    public List<Katalog> seeAllCatalog() {
        return service.getAllCatalog();
    }


    @PutMapping("product/{id}")
    public Katalog update(@PathVariable("id") int id, @RequestBody Katalog katalogDetails) {
        return service.updateProductById(id, katalogDetails);
    }
}
