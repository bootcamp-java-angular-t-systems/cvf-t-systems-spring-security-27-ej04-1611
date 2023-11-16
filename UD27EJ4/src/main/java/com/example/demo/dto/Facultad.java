package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "facultades")
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long id;
	private String nombre;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public List<Investigador> investigadores;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public List<Equipo> equipos;

	public Facultad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Facultad() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Investigador> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

}
