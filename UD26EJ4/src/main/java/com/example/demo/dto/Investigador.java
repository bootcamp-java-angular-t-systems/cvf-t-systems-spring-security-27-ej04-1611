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
@Table(name = "investigadores")
public class Investigador {

	@Id
	private String dni;

	private String nomApels;
	
	@ManyToOne
	@JsonIgnoreProperties("investigador")
	@JoinColumn(name = "facultad_id")
	private Facultad facultad;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigador")
	private List<Reserva> reservas;

	public Investigador() {
		super();
	}

	public Investigador(String dni, String nomApels, Facultad facultad) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultad = facultad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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
