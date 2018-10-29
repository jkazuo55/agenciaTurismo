package com.cronograma.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "paquetes")
public class Paquete implements Serializable {

	@OnDelete(action=OnDeleteAction.CASCADE)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idPaquete;

	@Column(name="nombre_paquete")
	private String nombrePaquete;
	@Column(name="descripcion_paquete")
	private String descripcionPaquete;
	@Column(name="costo_paquete")
	private float costoPaquete;
	@Column(name="estado_paquete")
	private String estadoPaquete;
	@Column(name="cupo_min_paquete")
	private int cupoMinPaquete;

	@OnDelete(action=OnDeleteAction.CASCADE)
	@ManyToOne
	@JoinColumn(name = "idCat")
	private Categoria categoriaId;

	@OnDelete(action=OnDeleteAction.CASCADE)
	@ManyToOne
	@JoinColumn(name = "idLugar")
	private Lugar lugarId;

	@OnDelete(action=OnDeleteAction.CASCADE)
	@ManyToOne
	@JoinColumn(name = "idCro")
	private Cronograma cronogramaid;

	

	public Long getIdPaquete() {
		return idPaquete;
	}



	public void setIdPaquete(Long idPaquete) {
		this.idPaquete = idPaquete;
	}



	public String getNombrePaquete() {
		return nombrePaquete;
	}



	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}



	public String getDescripcionPaquete() {
		return descripcionPaquete;
	}



	public void setDescripcionPaquete(String descripcionPaquete) {
		this.descripcionPaquete = descripcionPaquete;
	}



	public float getCostoPaquete() {
		return costoPaquete;
	}



	public void setCostoPaquete(float costoPaquete) {
		this.costoPaquete = costoPaquete;
	}



	public String getEstadoPaquete() {
		return estadoPaquete;
	}



	public void setEstadoPaquete(String estadoPaquete) {
		this.estadoPaquete = estadoPaquete;
	}



	public int getCupoMinPaquete() {
		return cupoMinPaquete;
	}



	public void setCupoMinPaquete(int cupoMinPaquete) {
		this.cupoMinPaquete = cupoMinPaquete;
	}



	public Categoria getCategoriaId() {
		return categoriaId;
	}



	public void setCategoriaId(Categoria categoriaId) {
		this.categoriaId = categoriaId;
	}



	public Lugar getLugarId() {
		return lugarId;
	}



	public void setLugarId(Lugar lugarId) {
		this.lugarId = lugarId;
	}



	public Cronograma getCronogramaid() {
		return cronogramaid;
	}



	public void setCronogramaid(Cronograma cronogramaid) {
		this.cronogramaid = cronogramaid;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
