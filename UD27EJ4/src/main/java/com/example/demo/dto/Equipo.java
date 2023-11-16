package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {

	@Id
	private String numSerie;
	private String nombre;

	@ManyToOne
	@JsonIgnoreProperties("equipo")
	@JoinColumn(name = "facultad_id")
	private Facultad facultad;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipo")
	private List<Reserva> reservas;

	public Equipo(String numSerie, String nombre, Facultad facultad) {
		super();
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	public Equipo() {
		super();
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}
