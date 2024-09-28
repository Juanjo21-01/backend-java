package com.prueba_springboot.intecap.service.serviceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prueba_springboot.intecap.common.CommonSvcImpl;
import com.prueba_springboot.intecap.models.clientesModel;
import com.prueba_springboot.intecap.repository.clienteRepository;
import com.prueba_springboot.intecap.service.clientesService;

@Service
public class clientesServiceImpl extends CommonSvcImpl<clientesModel, clienteRepository> implements clientesService {

    @Override
    public void deleteById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<clientesModel> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<clientesModel> findById(int id) {
        return this.repository.findById(id);
    }

    @Override
    public clientesModel save(clientesModel entity) {
        return this.repository.save(entity);
    }

    @Override
    public Iterable<clientesModel> saveAll(Iterable<clientesModel> entities) {
        return this.repository.saveAll(entities);
    }

    @Override
    public clientesModel findByNombre(String nombre) {
        return this.repository.findByNombre(nombre);
    }
}