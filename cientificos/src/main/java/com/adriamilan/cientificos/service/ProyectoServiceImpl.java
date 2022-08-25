package com.adriamilan.cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.cientificos.dao.IProyectoDAO;
import com.adriamilan.cientificos.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO proyectodao;

	@Override
	public List<Proyecto> listProyectos() {
		return proyectodao.findAll();
	}

	@Override
	public Proyecto proyectoXID(Long id) {
		return proyectodao.findById(id).get();
	}

	@Override
	public Proyecto saveProyecto(Proyecto proyecto) {
		return proyectodao.save(proyecto);
	}

	@Override
	public Proyecto editProyecto(Proyecto proyecto) {
		return proyectodao.save(proyecto);
	}

	@Override
	public String deleteProyecto(Long id) {
		proyectodao.deleteById(id);
		return "Proyecto Eliminado";
	}
	
}
