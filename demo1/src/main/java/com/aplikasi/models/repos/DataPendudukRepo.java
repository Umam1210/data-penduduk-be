package com.aplikasi.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aplikasi.models.entities.DataPenduduk;

public interface DataPendudukRepo extends CrudRepository<DataPenduduk, String> {
    List<DataPenduduk> findByNameContains(String name);
}
