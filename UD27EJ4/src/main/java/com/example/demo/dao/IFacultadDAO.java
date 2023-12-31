package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Facultad;

@Repository
public interface IFacultadDAO extends JpaRepository<Facultad, Long>{

}
