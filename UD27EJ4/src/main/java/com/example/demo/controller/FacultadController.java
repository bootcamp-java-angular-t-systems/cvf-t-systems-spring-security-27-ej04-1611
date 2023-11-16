package com.example.demo.controller;

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

import com.example.demo.dto.Facultad;
import com.example.demo.service.FacultadServiceImpl;

@RestController
@RequestMapping("/facultad")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadService;
	
	@GetMapping("/all")
	public List<Facultad> getAll() {
		return facultadService.findAll();
	}
	
	@GetMapping("/{id}")
	public Facultad getById(@PathVariable(name="id") Long id) {
		return facultadService.findById(id);
	}
	
	
	@PostMapping("")
	public Facultad createFacultad(@RequestBody Facultad facultad) {
		return facultadService.save(facultad);
	}
	
	@PutMapping("/{id}")
	public Facultad updateFacultad(@PathVariable(name="id")Long id,@RequestBody Facultad facultad) {
		
		Facultad facultadSeleccionada= new Facultad();
		
		facultadSeleccionada= facultadService.findById(id);
		
		facultadSeleccionada.setNombre(facultad.getNombre());
		
		
		facultadSeleccionada = facultadService.update(facultadSeleccionada);
		
		return facultadSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteFacultad(@PathVariable(name="id") Long id) {
		facultadService.delete(id);
	}
}
