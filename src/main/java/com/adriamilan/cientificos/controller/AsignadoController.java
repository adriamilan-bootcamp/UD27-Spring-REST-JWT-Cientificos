package com.adriamilan.cientificos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.cientificos.dto.Asignado;
import com.adriamilan.cientificos.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asignadoserv;
	
	@GetMapping("/asignaciones")
	public List<Asignado> listAsignaciones() {
		return asignadoserv.listAsignado();
	}
	
	@GetMapping("/asignacion/{id}")
	public Asignado asignacionXID(@PathVariable(name="id") Long id) {
		return asignadoserv.asignadoXID(id);
	}

	@PutMapping("/asignacion")
	public Asignado saveAsignacion(@RequestBody Asignado asignado) {
		return asignadoserv.saveAsignado(asignado);
	}
	
	@PutMapping("asignacion/id")
	public Asignado editAsignacion(@PathVariable(name="id") Long id, @RequestBody Asignado asignado) {
		Asignado asignadoSelected = new Asignado();
		Asignado asignadoUpdated = new Asignado();
	
		asignadoSelected = asignadoserv.asignadoXID(id);
		asignadoSelected.setCientifico(asignado.getCientifico());
		asignadoSelected.setProyecto(asignado.getProyecto());
		
		asignadoUpdated = asignadoserv.editAsignado(asignadoSelected);
		
		return asignadoUpdated;
	}
	
	@DeleteMapping("/asignado/{id}")
	public String deleteAsignado(@PathVariable(name="id") Long id) {
		return asignadoserv.deleteAsignado(id);
	}
	
}
