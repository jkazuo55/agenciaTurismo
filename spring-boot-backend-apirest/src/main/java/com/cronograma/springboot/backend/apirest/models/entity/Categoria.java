package com.cronograma.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity // marcamos para identificar q es una clase entity de jpa
@Table(name = "categorias") // para diferencias los nombres de bd y clases
public class Categoria implements Serializable {

	@OnDelete(action=OnDeleteAction.CASCADE)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_cat")
	private Long idCat;
	
	@Column(name = "nombre_cat")
	private String nombreCat;
	
	@Column(name = "descripcion_cat")
	private String descripcionCat;

	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getNombreCat() {
		return nombreCat;
	}

	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}

	public String getDescripcionCat() {
		return descripcionCat;
	}

	public void setDescripcionCat(String descripcionCat) {
		this.descripcionCat = descripcionCat;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
