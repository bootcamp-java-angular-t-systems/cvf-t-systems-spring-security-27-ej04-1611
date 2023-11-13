package com.example.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "productos")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFin;
	
	@ManyToOne
	@JsonIgnoreProperties("reserva")
	@JoinColumn(name = "investigador_id")
	private Investigador investigador;
	
	
	@ManyToOne
	@JsonIgnoreProperties("reserva")
	@JoinColumn(name = "equpo_id")
	private Equipo equipo;


	public Reserva() {
		super();
	}


	public Reserva(Date fechaInicio, Date fechaFin, Investigador investigador, Equipo equipo) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.investigador = investigador;
		this.equipo = equipo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public Investigador getInvestigador() {
		return investigador;
	}


	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
