package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadorDAO;
import com.example.demo.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService{

	@Autowired
	IInvestigadorDAO investigadorDAO;
	
	public List<Investigador> findAll() {
		return investigadorDAO.findAll();
	}
	
	public Investigador findById(String id) {
		return investigadorDAO.findById(id).get();
	}
	
	public Investigador save(Investigador investigador) {
		return investigadorDAO.save(investigador);
	}
	
	public Investigador update(Investigador investigador) {
		return investigadorDAO.save(investigador);
	}
	
	public void delete(String id) {
		investigadorDAO.deleteById(id);
	}
}

