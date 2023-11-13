package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Reserva;

public interface IReservaService {

	public List<Reserva> findAll();

	public Reserva findById(Long id);

	public Reserva update(Reserva reserva);

	public Reserva save(Reserva reserva);

	public void delete(Long id);

}
