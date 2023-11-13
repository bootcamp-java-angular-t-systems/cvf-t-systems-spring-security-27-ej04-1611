package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEquipoDAO;
import com.example.demo.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{

	@Autowired
	IEquipoDAO equipoDAO;
	
	public List<Equipo> findAll() {
		return equipoDAO.findAll();
	}
	
	public Equipo findById(String id) {
		return equipoDAO.findById(id).get();
	}
	
	public Equipo save(Equipo equipo) {
		return equipoDAO.save(equipo);
	}
	
	public Equipo update(Equipo equipo) {
		return equipoDAO.save(equipo);
	}
	
	public void delete(String id) {
		equipoDAO.deleteById(id);
	}
}
