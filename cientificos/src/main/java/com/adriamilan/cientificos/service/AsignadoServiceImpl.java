package com.adriamilan.cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.cientificos.dao.IAsignadoDAO;
import com.adriamilan.cientificos.dto.Asignado;

@Service
public class AsignadoServiceImpl implements IAsignadoService {

	@Autowired
	IAsignadoDAO asignadodao;

	@Override
	public List<Asignado> listAsignado() {
		return asignadodao.findAll();
	}

	@Override
	public Asignado asignadoXID(Long id) {
		return asignadodao.findById(id).get();
	}

	@Override
	public Asignado saveAsignado(Asignado asignado) {
		return asignadodao.save(asignado);
	}

	@Override
	public Asignado editAsignado(Asignado asignado) {
		return asignadodao.save(asignado);
	}

	@Override
	public String deleteAsignado(Long id) {
		asignadodao.deleteById(id);
		return "Asignacion eliminada";
	}
	
}
