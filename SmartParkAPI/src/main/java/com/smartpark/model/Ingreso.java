package com.smartpark.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "Ingreso")
@Data
public class Ingreso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_registro;

	@ManyToOne
	@JoinColumn(name = "cod_cajero",nullable=false)
	private Cajero cajero;
	
	@Column(name = "pais",nullable=false,length=9)
	private String placa;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="H_inicio", nullable = false)
	private Date H_inicio;
	
	@ManyToOne
	@JoinColumn(name = "cod_vehiculo",nullable=false)
	private Vehiculo vehiculo;
	
	@ManyToOne
	@JoinColumn(name = "cod_espacio",nullable=false)
	private Espacio espacio;
	
	
}
