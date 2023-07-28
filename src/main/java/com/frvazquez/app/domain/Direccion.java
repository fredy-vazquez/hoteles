package com.frvazquez.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    private String ciudad;
    private String estado;
    private String pais;

    // Constructor vacío (obligatorio para JPA)
    public Direccion() {
    }

    // Constructor con todos los campos
    public Direccion(String calle, String codigoPostal, String ciudad, String estado, String pais) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }

    // Getters y Setters (obligatorios para JPA)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método toString() para representar el objeto como cadena
    @Override
    public String toString() {
        return "Direccion [id=" + id + ", calle=" + calle + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad
                + ", estado=" + estado + ", pais=" + pais + "]";
    }
}
