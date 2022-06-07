package com.javatechie.kb.api.service;

import com.javatechie.kb.api.entity.Katalog;
import com.javatechie.kb.api.repository.KatalogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class KatalogService {
    @Autowired
    private KatalogRepository repository;

    @Autowired
    private RestTemplate template;
    Logger logger= LoggerFactory.getLogger(KatalogService.class);

    public Katalog saveKatalog(Katalog katalog){
        return repository.save(katalog);
    }

    public Katalog getProductById(int id){
        return repository.findById(id).get();
    }

    public List<Katalog> getAllCatalog()
    {
        List<Katalog> catalogs = new ArrayList<Katalog>();
        repository.findAll().forEach(Katalog -> catalogs.add(Katalog));
        return catalogs;
    }

    public Katalog updateProductById(int id, Katalog katalogDetail){
//        return repository.findById(id).get();
        Katalog katalog = repository.findById(id).get();
        katalog.setNamaBarang(katalogDetail.getNamaBarang());
        katalog.setPrice(katalogDetail.getPrice());
        katalog.setStok(katalogDetail.getStok());
        final Katalog updatedKatalog = repository.save(katalog);
        return repository.findById(id).get();
    }
}
