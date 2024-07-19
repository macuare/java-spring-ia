package com.macuare.desafio_dio_api.domain.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tipomaterial", catalog = "sistemaintegradodb", schema = "")
public class TipoMaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoMaterial")
    private Integer idtipoMaterial;
    @Basic(optional = false)
    @Column(name = "nombreMaterial")
    private String nombreMaterial;
    @Basic(optional = false)
    @Column(name = "codigoInterno")
    private String codigoInterno;
    @Basic(optional = false)
    @Column(name = "cas")
    private String cas;
    @JoinColumn(name = "ClasificacionMaterial_idClasificacionMaterial", referencedColumnName = "idClasificacionMaterial")
    @ManyToOne(optional = false)
    private ClasificacionMaterial clasificacionMaterialidClasificacionMaterial;


    public TipoMaterial() {
    }

    public TipoMaterial(Integer idtipoMaterial, String nombreMaterial, String codigoInterno, String cas, ClasificacionMaterial clasificacionMaterialidClasificacionMaterial) {
        this.idtipoMaterial = idtipoMaterial;
        this.nombreMaterial = nombreMaterial;
        this.codigoInterno = codigoInterno;
        this.cas = cas;
        this.clasificacionMaterialidClasificacionMaterial = clasificacionMaterialidClasificacionMaterial;
    }

    public Integer getIdtipoMaterial() {
        return idtipoMaterial;
    }

    public void setIdtipoMaterial(Integer idtipoMaterial) {
        this.idtipoMaterial = idtipoMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public ClasificacionMaterial getClasificacionMaterialidClasificacionMaterial() {
        return clasificacionMaterialidClasificacionMaterial;
    }

    public void setClasificacionMaterialidClasificacionMaterial(ClasificacionMaterial clasificacionMaterialidClasificacionMaterial) {
        this.clasificacionMaterialidClasificacionMaterial = clasificacionMaterialidClasificacionMaterial;
    }

    @Override
    public String toString() {
        return "TipoMaterial{" +
                "idtipoMaterial=" + idtipoMaterial +
                ", nombreMaterial='" + nombreMaterial + '\'' +
                ", codigoInterno='" + codigoInterno + '\'' +
                ", cas='" + cas + '\'' +
                ", clasificacionMaterialidClasificacionMaterial=" + clasificacionMaterialidClasificacionMaterial +
                '}';
    }
}