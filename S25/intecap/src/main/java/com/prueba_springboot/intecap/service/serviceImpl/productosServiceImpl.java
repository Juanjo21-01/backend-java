package com.prueba_springboot.intecap.service.serviceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prueba_springboot.intecap.common.CommonSvcImpl;
import com.prueba_springboot.intecap.models.productosModel;
import com.prueba_springboot.intecap.repository.productoRepository;
import com.prueba_springboot.intecap.service.productosService;

@Service
public class productosServiceImpl extends CommonSvcImpl<productosModel, productoRepository> implements productosService {

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<productosModel> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<productosModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public productosModel save(productosModel entity) {
        return this.repository.save(entity);
    }

    @Override
    public Iterable<productosModel> saveAll(Iterable<productosModel> entities) {
        return this.repository.saveAll(entities);
    }

    @Override
    public productosModel findByNombre(String nombre) {
        return this.repository.findByNombre(nombre);
    }
}