package com.adriamilan.cientificos.service;

import java.util.List;

import com.adriamilan.cientificos.dto.Asignado;

public interface IAsignadoService {

	public List<Asignado> listAsignado();
	
	public Asignado asignadoXID(Long id);
	
	public Asignado saveAsignado(Asignado asignado);
	
	public Asignado editAsignado(Asignado asignado);
	
	public String deleteAsignado(Long id);
	
}
