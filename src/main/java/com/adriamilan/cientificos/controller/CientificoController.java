package com.adriamilan.cientificos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.cientificos.dto.Cientifico;
import com.adriamilan.cientificos.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoserv;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listCientificos() {
		return cientificoserv.listCientificos();
	}
	
	@GetMapping("/cientifico/{id}")
	public Cientifico cientificoXID(@PathVariable(name="id") Long id) {
		return cientificoserv.cientificoXID(id);
	}

	@PostMapping("/cientifico")
	public Cientifico saveCientificos(@RequestBody Cientifico cientifico) {
		return cientificoserv.saveCientifico(cientifico);
	}
	
	@PutMapping("/cientifico/{id}")
	public Cientifico editCientifico(@PathVariable(name="id") Long id, @RequestBody Cientifico cientifico) {
		Cientifico cientificoSelected = new Cientifico();
		Cientifico cientificoUpdated = new Cientifico();
		
		cientificoSelected = cientificoserv.cientificoXID(id);
		cientificoSelected.setNombreApellidos(cientifico.getNombreApellidos());
		
		cientificoUpdated = cientificoserv.editCientifico(cientificoSelected);
		
		return cientificoUpdated;
	}
	
	@DeleteMapping("/cientifico/{id}")
	public String deleteCientifico(@PathVariable(name="id") Long id) {
		return cientificoserv.deleteCientifico(id);
	}
	
}
