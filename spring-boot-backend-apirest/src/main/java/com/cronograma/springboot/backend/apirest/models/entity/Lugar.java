package com.cronograma.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="lugares")
public class Lugar implements Serializable {

	@OnDelete(action=OnDeleteAction.CASCADE)
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long idLugar;
	
	private String nombreLugar;
	private String descripcionLugar;
	private String ubicacionLugar;

	public Long getIdLugar() {
		return idLugar;
	}

	public void setIdLugar(Long idLugar) {
		this.idLugar = idLugar;
	}

	public String getNombreLugar() {
		return nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	public String getDescripcionLugar() {
		return descripcionLugar;
	}

	public void setDescripcionLugar(String descripcionLugar) {
		this.descripcionLugar = descripcionLugar;
	}

	public String getUbicacionLugar() {
		return ubicacionLugar;
	}

	public void setUbicacionLugar(String ubicacionLugar) {
		this.ubicacionLugar = ubicacionLugar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
