package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> findAll();

	public Facultad findById(Long id);

	public Facultad update(Facultad facultad);

	public Facultad save(Facultad facultad);

	public void delete(Long id);

}
