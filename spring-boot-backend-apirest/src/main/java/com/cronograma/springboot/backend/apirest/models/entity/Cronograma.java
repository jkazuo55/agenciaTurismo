package com.cronograma.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "cronogramas")
public class Cronograma implements Serializable {

	@OnDelete(action=OnDeleteAction.CASCADE)
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="NAME_SEQUENCE")
	@SequenceGenerator(name="NAME_SEQUENCE",sequenceName="SEQ_ID", allocationSize=1)
	@Column(name = "id_cro", updatable=false, unique=true, nullable=false)
	private Long idCro;

	@Column(name = "nombre_cro")
	private String nombreCro;
	@Column(name = "descripcion_cro")
	private String descripcionCro;

	@Column(name = "hora_cro")
	@Temporal(TemporalType.TIME)
	private Date horaCro;

	@Column(name = "fecha_cro")
	@Temporal(TemporalType.DATE)
	private Date fechaCro;

	public Long getIdCro() {
		return idCro;
	}

	public void setIdCro(Long idCro) {
		this.idCro = idCro;
	}

	public String getNombreCro() {
		return nombreCro;
	}

	public void setNombreCro(String nombreCro) {
		this.nombreCro = nombreCro;
	}

	public String getDescripcionCro() {
		return descripcionCro;
	}

	public void setDescripcionCro(String descripcionCro) {
		this.descripcionCro = descripcionCro;
	}

	public Date getHoraCro() {
		return horaCro;
	}

	public void setHoraCro(Date horaCro) {
		this.horaCro = horaCro;
	}

	public Date getFechaCro() {
		return fechaCro;
	}

	public void setFechaCro(Date fechaCro) {
		this.fechaCro = fechaCro;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
