package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Investigador;

@Repository
public interface IInvestigadorDAO extends JpaRepository<Investigador, String>{

}
