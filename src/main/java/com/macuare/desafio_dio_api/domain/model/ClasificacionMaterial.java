package com.macuare.desafio_dio_api.domain.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "clasificacionmaterial", catalog = "sistemaintegradodb", schema = "")
public class ClasificacionMaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClasificacionMaterial")
    private Integer idClasificacionMaterial;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;


    public ClasificacionMaterial() {
    }

    public ClasificacionMaterial(Integer idClasificacionMaterial, String nombre) {
        this.idClasificacionMaterial = idClasificacionMaterial;
        this.nombre = nombre;
    }

    public Integer getIdClasificacionMaterial() {
        return idClasificacionMaterial;
    }

    public void setIdClasificacionMaterial(Integer idClasificacionMaterial) {
        this.idClasificacionMaterial = idClasificacionMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ClasificacionMaterial{" +
                "idClasificacionMaterial=" + idClasificacionMaterial +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}