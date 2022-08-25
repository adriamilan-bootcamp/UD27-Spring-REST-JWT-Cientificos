package com.adriamilan.cientificos.service;

import java.util.List;

import com.adriamilan.cientificos.dto.Proyecto;

public interface IProyectoService {

	public List<Proyecto> listProyectos();
	
	public Proyecto proyectoXID(Long id);
	
	public Proyecto saveProyecto(Proyecto proyecto);
	
	public Proyecto editProyecto(Proyecto proyecto);
	
	public String deleteProyecto(Long id);
	
}
