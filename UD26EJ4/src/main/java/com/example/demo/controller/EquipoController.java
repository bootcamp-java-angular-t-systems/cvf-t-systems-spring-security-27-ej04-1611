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

import com.example.demo.dto.Equipo;
import com.example.demo.service.EquipoServiceImpl;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoService;
	
	@GetMapping("/all")
	public List<Equipo> getAll() {
		return equipoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Equipo getById(@PathVariable(name="id") String id) {
		return equipoService.findById(id);
	}
	
	
	@PostMapping("")
	public Equipo createEquipo(@RequestBody Equipo equipo) {
		return equipoService.save(equipo);
	}
	
	@PutMapping("/{id}")
	public Equipo updateEquipo(@PathVariable(name="id")String id,@RequestBody Equipo equipo) {
		
		Equipo equipoSeleccionada= new Equipo();
		
		equipoSeleccionada= equipoService.findById(id);
		
		equipoSeleccionada.setNumSerie(equipo.getNumSerie());
		equipoSeleccionada.setNombre(equipo.getNombre());
		equipoSeleccionada.setFacultad(equipo.getFacultad());
		
		equipoSeleccionada = equipoService.update(equipoSeleccionada);
		
		return equipoSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteEquipo(@PathVariable(name="id") String id) {
		equipoService.delete(id);
	}
}
