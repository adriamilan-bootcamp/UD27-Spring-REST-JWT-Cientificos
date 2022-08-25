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
@Table(name="proyectos")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="horas")
	private int horas;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="proyecto")
	private List<Asignado> asignados;
	
	// Constructor por defecto
	public Proyecto() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 */
	public Proyecto(Long id, String nombre, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
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
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
	
}
