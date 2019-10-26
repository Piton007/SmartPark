package com.smartpark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "Parking")
@Data
public class Parking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_parking;
	
	@Column(name = "nombre",nullable=false)
	private String nombre;
	
	@Column(name = "descripcion",nullable=false,length=200)
	private String descripcion;
	
	@Column(name = "direccion",nullable=false,length=50)
	private String direccion;
	
	@Column(name = "pais",nullable=false,length=20)
	private String pais;
	

	@Column(name = "locacion",nullable=false,length=20)
	private String locacion;
	
	@Column(name="tipo_veh", nullable = false)
	private long telefono;
	
	@ManyToOne
	@JoinColumn(name = "cod_admin",nullable=false)
	private Administrador admin;
	


}
