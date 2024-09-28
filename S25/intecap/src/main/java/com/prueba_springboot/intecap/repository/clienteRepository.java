package com.prueba_springboot.intecap.repository;

import org.springframework.data.repository.CrudRepository;
import com.prueba_springboot.intecap.models.clientesModel;

public interface clienteRepository extends CrudRepository<clientesModel, Object> {

    // funcion para buscar por nombre
    public clientesModel findByNombre(String nombre);
}
