package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFacultadDAO;
import com.example.demo.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{

	@Autowired
	IFacultadDAO facultadDAO;
	
	public List<Facultad> findAll() {
		return facultadDAO.findAll();
	}
	
	public Facultad findById(Long id) {
		return facultadDAO.findById(id).get();
	}
	
	public Facultad save(Facultad facultad) {
		return facultadDAO.save(facultad);
	}
	
	public Facultad update(Facultad facultad) {
		return facultadDAO.save(facultad);
	}
	
	public void delete(Long id) {
		facultadDAO.deleteById(id);
	}
}
