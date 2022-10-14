package com.aplikasi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplikasi.models.entities.DataPenduduk;
import com.aplikasi.services.DataPendudukService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/data")
public class DataPendudukController {

    @Autowired
    private DataPendudukService DataPendudukService;

    @PostMapping
    public DataPenduduk save(@RequestBody DataPenduduk dataPenduduk){
        return DataPendudukService.save(dataPenduduk);
    }
    
    @GetMapping
    public Iterable <DataPenduduk> findAll(){
        return DataPendudukService.findAll();
    }

    @GetMapping("{id}")
    public DataPenduduk findOne(@PathVariable("id") String id){
        return DataPendudukService.findOne(id);
    }

    @PatchMapping
    public DataPenduduk update(@RequestBody DataPenduduk dataPenduduk){
        return DataPendudukService.save(dataPenduduk);
    }

    @DeleteMapping("{id}")
    public void removeOne(@PathVariable("id") String id){
        DataPendudukService.removeOne(id);
    }
}
