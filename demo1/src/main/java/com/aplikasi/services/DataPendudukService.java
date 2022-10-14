package com.aplikasi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplikasi.models.entities.DataPenduduk;
import com.aplikasi.models.repos.DataPendudukRepo;

@Service
@Transactional
public class DataPendudukService {
    
    @Autowired
    private DataPendudukRepo dataPendudukRepo;


    public DataPenduduk save(DataPenduduk DataPenduduk){
        return dataPendudukRepo.save(DataPenduduk);
    }

    public DataPenduduk findOne(String id) {
        Optional<DataPenduduk> Data = dataPendudukRepo.findById(id);
        if (!Data.isPresent()){
            return null;
        } else {
        return Data.get();
        }
    }

    public Iterable<DataPenduduk> findAll(){
        return dataPendudukRepo.findAll();
    }

    public void removeOne(String id){
        dataPendudukRepo.deleteById(id);
    }

    public List<DataPenduduk> findByName(String name) {
        return dataPendudukRepo.findByNameContains(name);
    }
}
