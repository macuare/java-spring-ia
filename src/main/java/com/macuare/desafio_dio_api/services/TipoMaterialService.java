package com.macuare.desafio_dio_api.services;


import com.macuare.desafio_dio_api.domain.model.TipoMaterial;

public interface TipoMaterialService {
    TipoMaterial findById(int id);
    TipoMaterial create(TipoMaterial tipoMaterial);
}
