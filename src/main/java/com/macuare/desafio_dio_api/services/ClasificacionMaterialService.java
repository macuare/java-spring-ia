package com.macuare.desafio_dio_api.services;

import com.macuare.desafio_dio_api.domain.model.ClasificacionMaterial;

public interface ClasificacionMaterialService {
    public ClasificacionMaterial findById(int id);
    public ClasificacionMaterial create(ClasificacionMaterial clasificacionMaterial);
}
