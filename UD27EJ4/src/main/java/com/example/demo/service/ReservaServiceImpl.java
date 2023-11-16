package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IReservaDAO;
import com.example.demo.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{

	@Autowired
	IReservaDAO reservaDAO;
	
	public List<Reserva> findAll() {
		return reservaDAO.findAll();
	}
	
	public Reserva findById(Long id) {
		return reservaDAO.findById(id).get();
	}
	
	public Reserva save(Reserva reserva) {
		return reservaDAO.save(reserva);
	}
	
	public Reserva update(Reserva reserva) {
		return reservaDAO.save(reserva);
	}
	
	public void delete(Long id) {
		reservaDAO.deleteById(id);
	}
}
