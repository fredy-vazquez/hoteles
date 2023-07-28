package com.frvazquez.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservacion_detalle")
public class ReservacionDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reservacion_id")
    private Long reservacionId; // Puede ser un Long o un tipo que represente la relación con la tabla "reservacion"
    @Column(name = "habitacion_id")
    private Long habitacionId; // Puede ser un Long o un tipo que represente la relación con la tabla "habitacion"
    private Double costo;
    private Integer estado;

    // Constructor vacío (obligatorio para JPA)
    public ReservacionDetalle() 
    
    {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReservacionId() {
		return reservacionId;
	}

	public void setReservacionId(Long reservacionId) {
		this.reservacionId = reservacionId;
	}

	public Long getHabitacionId() {
		return habitacionId;
	}

	public void setHabitacionId(Long habitacionId) {
		this.habitacionId = habitacionId;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ReservacionDetalle [id=" + id + ", reservacionId=" + reservacionId + ", habitacionId=" + habitacionId
				+ ", costo=" + costo + ", estado=" + estado + "]";
	}
}


