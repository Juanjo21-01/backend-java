package com.prueba_springboot.intecap.repository;

import org.springframework.data.repository.CrudRepository;
import com.prueba_springboot.intecap.models.productosModel;

public interface productoRepository extends CrudRepository<productosModel, Object> {

    // funcion para buscar por nombre
    public productosModel findByNombre(String nombre);
}
