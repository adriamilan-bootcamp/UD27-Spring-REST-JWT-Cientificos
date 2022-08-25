package com.adriamilan.cientificos.service;

import java.util.List;

import com.adriamilan.cientificos.dto.Cientifico;

public interface ICientificoService {

	public List<Cientifico> listCientificos();
	
	public Cientifico cientificoXID(Long id);
	
	public Cientifico saveCientifico(Cientifico cientifico);
	
	public Cientifico editCientifico(Cientifico cientifico);
	
	public String deleteCientifico(Long id);
	
}
