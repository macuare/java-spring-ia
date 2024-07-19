package com.macuare.desafio_dio_api.controller;

import com.macuare.desafio_dio_api.domain.model.TipoMaterial;
import com.macuare.desafio_dio_api.services.TipoMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/material")
public class TipoMaterialController {
    @Autowired
    TipoMaterialService tipoMaterialService;

    @GetMapping("/{id}")
    public ResponseEntity<TipoMaterial> buscarPorID(@PathVariable int id) {
        TipoMaterial tm = tipoMaterialService.findById(id);
        return ResponseEntity.ok(tm);
    }

    @PostMapping
    public ResponseEntity<TipoMaterial> crearNuevo(@RequestBody TipoMaterial tipoMaterial) {
        TipoMaterial tm = tipoMaterialService.create(tipoMaterial);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(tm.getIdtipoMaterial())
                .toUri();
        return ResponseEntity.created(location).body(tm);
    }
}
