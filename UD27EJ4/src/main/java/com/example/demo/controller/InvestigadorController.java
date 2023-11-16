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

import com.example.demo.dto.Investigador;
import com.example.demo.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/investigador")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorService;
	
	@GetMapping("/all")
	public List<Investigador> getAll() {
		return investigadorService.findAll();
	}
	
	@GetMapping("/{id}")
	public Investigador getById(@PathVariable(name="id") String id) {
		return investigadorService.findById(id);
	}
	
	
	@PostMapping("")
	public Investigador createInvestigador(@RequestBody Investigador investigador) {
		return investigadorService.save(investigador);
	}
	
	@PutMapping("/{id}")
	public Investigador updateInvestigador(@PathVariable(name="id")String id,@RequestBody Investigador investigador) {
		
		Investigador investigadorSeleccionada= new Investigador();
		
		investigadorSeleccionada= investigadorService.findById(id);
		
		investigadorSeleccionada.setDni(investigador.getDni());
		investigadorSeleccionada.setNomApels(investigador.getNomApels());
		investigadorSeleccionada.setFacultad(investigador.getFacultad());
		
		investigadorSeleccionada = investigadorService.update(investigadorSeleccionada);
		
		return investigadorSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteInvestigador(@PathVariable(name="id") String id) {
		investigadorService.delete(id);
	}
}
