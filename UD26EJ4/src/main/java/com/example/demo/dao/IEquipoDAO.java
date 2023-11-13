package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Equipo;

@Repository
public interface IEquipoDAO  extends JpaRepository<Equipo, String>{

}
