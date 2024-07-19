package com.macuare.desafio_dio_api.services.impl;

import com.macuare.desafio_dio_api.domain.model.ClasificacionMaterial;
import com.macuare.desafio_dio_api.domain.repository.ClasificacionMaterialRepository;
import com.macuare.desafio_dio_api.services.ClasificacionMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasificacionMaterialServiceImpl implements ClasificacionMaterialService {
    @Autowired
    private ClasificacionMaterialRepository repository;

    @Override
    public ClasificacionMaterial findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public ClasificacionMaterial create(ClasificacionMaterial clasificacionMaterial) {
        return repository.save(clasificacionMaterial);
    }
}
