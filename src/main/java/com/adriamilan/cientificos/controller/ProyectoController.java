package com.adriamilan.cientificos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.cientificos.dto.Proyecto;
import com.adriamilan.cientificos.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoserv;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listProyectos() {
		return proyectoserv.listProyectos();
	}
	
	@GetMapping("/proyecto/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") Long id) {
		return proyectoserv.proyectoXID(id);
	}
	
	@PostMapping("/proyecto")
	public Proyecto saveProyecto(@RequestBody Proyecto proyecto) {
		return proyectoserv.saveProyecto(proyecto);
	}

	@PutMapping("/proyecto/{id}")
	public Proyecto editProyecto(@PathVariable(name="id") Long id, @RequestBody Proyecto proyecto) {
		Proyecto proyectoSelected = new Proyecto();
		Proyecto proyectoUpdated = new Proyecto();
		
		proyectoSelected = proyectoserv.proyectoXID(id);
		proyectoSelected.setNombre(proyecto.getNombre());
		proyectoSelected.setHoras(proyecto.getHoras());
		
		proyectoUpdated = proyectoserv.editProyecto(proyectoSelected);
	
		return proyectoUpdated;
	}
	
}
