package com.prueba_springboot.intecap.service;

import java.util.Optional;

import com.prueba_springboot.intecap.common.CommonSvc;
import com.prueba_springboot.intecap.models.productosModel;

public interface productosService extends CommonSvc<productosModel> {

    public Iterable<productosModel> findAll();

    public Optional<productosModel> findById(int id);

    public productosModel findByNombre(String nombre);

    public productosModel save(productosModel entity);

    public void deleteById(int id);

    Iterable<productosModel> saveAll(Iterable<productosModel> entities);
}