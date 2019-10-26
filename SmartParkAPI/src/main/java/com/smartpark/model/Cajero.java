package com.smartpark.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "Cajero")
@Data
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_cajero;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ingreso", nullable = false)
	private Date ingreso;
	
	@Column(name = "contraseña",nullable=false,length=20)
	private String contraseña;
	
	@Column(name = "nombre",nullable=false,length=20)
	private String nombre;
	
	@Column(name = "apellido",nullable=false,length=20)
	private String apellido;
	
	@Column(name = "turno",nullable=false,length=15)
	private String turno;
}
