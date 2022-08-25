package com.adriamilan.cientificos.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientifico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre_apellidos")
	private String nombreApellidos;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cientifico")
	private List<Asignado> asignados;
	
	// Constructor por defecto
	public Cientifico() {
		
	}

	/**
	 * @param id
	 * @param nombreApellidos
	 */
	public Cientifico(Long id, String nombreApellidos) {
		super();
		this.id = id;
		this.nombreApellidos = nombreApellidos;
	}

	/**
	 * @return the nombreApellidos
	 */
	public String getNombreApellidos() {
		return nombreApellidos;
	}

	/**
	 * @param nombreApellidos the nombreApellidos to set
	 */
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @return the asigndaos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignados() {
		return asignados;
	}

	/**
	 * @param asigndaos the asigndaos to set
	 */
	public void setAsignados(List<Asignado> asignados) {
		this.asignados = asignados;
	}

	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", nombreApellidos=" + nombreApellidos + "]";
	}
	
}
