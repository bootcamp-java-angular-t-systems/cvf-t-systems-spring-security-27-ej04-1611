package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Investigador;

public interface IInvestigadorService {

	public List<Investigador> findAll();

	public Investigador findById(String id);

	public Investigador update(Investigador investigador);

	public Investigador save(Investigador investigador);

	public void delete(String id);

}
