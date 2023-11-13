package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Equipo;

public interface IEquipoService {

	public List<Equipo> findAll();

	public Equipo findById(String id);

	public Equipo update(Equipo equipo);

	public Equipo save(Equipo equipo);

	public void delete(String id);

}
