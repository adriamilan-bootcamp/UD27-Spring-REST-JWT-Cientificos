package com.adriamilan.cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.cientificos.dao.ICientificoDAO;
import com.adriamilan.cientificos.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificoDAO cientificodao;

	@Override
	public List<Cientifico> listCientificos() {
		return cientificodao.findAll();
	}

	@Override
	public Cientifico cientificoXID(Long id) {
		return cientificodao.findById(id).get();
	}

	@Override
	public Cientifico saveCientifico(Cientifico cientifico) {
		return cientificodao.save(cientifico);
	}

	@Override
	public Cientifico editCientifico(Cientifico cientifico) {
		return cientificodao.save(cientifico);
	}

	@Override
	public String deleteCientifico(Long id) {
		cientificodao.deleteById(id);
		return "Cientifico eliminado";
	}
	
}
