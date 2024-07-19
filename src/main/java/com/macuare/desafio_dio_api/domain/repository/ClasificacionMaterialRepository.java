package com.macuare.desafio_dio_api.domain.repository;

import com.macuare.desafio_dio_api.domain.model.ClasificacionMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionMaterialRepository extends JpaRepository<ClasificacionMaterial, Integer> {
}
