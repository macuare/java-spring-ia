package com.macuare.desafio_dio_api.controller;

import com.macuare.desafio_dio_api.domain.model.ClasificacionMaterial;
import com.macuare.desafio_dio_api.services.ClasificacionMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clasificacion")
public class ClasificacionMaterialController {

    @Autowired
    private ClasificacionMaterialService clasificacionMaterialService;

    @GetMapping("/{id}")
    public ResponseEntity<ClasificacionMaterial> buscarPorID(@PathVariable int id) {
        ClasificacionMaterial cm = clasificacionMaterialService.findById(id);
        return ResponseEntity.ok(cm);
    }

    @PostMapping
    public ResponseEntity<ClasificacionMaterial> crearNuevo(@RequestBody ClasificacionMaterial clasificacionMaterial) {
        ClasificacionMaterial cm = clasificacionMaterialService.create(clasificacionMaterial);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cm.getIdClasificacionMaterial())
                .toUri();
        return ResponseEntity.created(location).body(cm);

    }
}
