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

import com.example.demo.dto.Reserva;
import com.example.demo.service.ReservaServiceImpl;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaService;
	
	@GetMapping("/all")
	public List<Reserva> getAll() {
		return reservaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Reserva getById(@PathVariable(name="id") Long id) {
		return reservaService.findById(id);
	}
	
	
	@PostMapping("")
	public Reserva createReserva(@RequestBody Reserva reserva) {
		return reservaService.save(reserva);
	}
	
	@PutMapping("/{id}")
	public Reserva updateReserva(@PathVariable(name="id")Long id,@RequestBody Reserva reserva) {
		
		Reserva reservaSeleccionada= new Reserva();
		
		reservaSeleccionada= reservaService.findById(id);
		
		reservaSeleccionada.setEquipo(reserva.getEquipo());
		reservaSeleccionada.setInvestigador(reserva.getInvestigador());
		reservaSeleccionada.setFechaInicio(reserva.getFechaInicio());
		reservaSeleccionada.setFechaFin(reserva.getFechaFin());
		
		reservaSeleccionada = reservaService.update(reservaSeleccionada);
		
		return reservaSeleccionada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteReserva(@PathVariable(name="id") Long id) {
		reservaService.delete(id);
	}
}
