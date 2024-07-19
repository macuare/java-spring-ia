package com.macuare.desafio_dio_api.services.impl;

import com.macuare.desafio_dio_api.domain.model.TipoMaterial;
import com.macuare.desafio_dio_api.domain.repository.TipoMaterialRepository;
import com.macuare.desafio_dio_api.services.TipoMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoMaterialServiceImpl implements TipoMaterialService {
    @Autowired
    TipoMaterialRepository tipoMaterialRepository;

    @Override
    public TipoMaterial findById(int id) {
        return tipoMaterialRepository.findById(id).get();
    }

    @Override
    public TipoMaterial create(TipoMaterial tipoMaterial) {
        return tipoMaterialRepository.save(tipoMaterial);
    }
}
