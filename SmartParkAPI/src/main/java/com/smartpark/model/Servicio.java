package com.smartpark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "Servicio")
@Data
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_servicio;
	
	@Column(name = "Costo_Servicio",nullable=false)
	private double costo_servicio;
	
	@Size(min=3, message = "El tipo de vehiculo mínimo 3 caracteres")
	@Column(name="tipo_veh", nullable = false, length = 20)
	private String tipo_servicio;
	

	@Size(min=3, message = "El tipo de vehiculo mínimo 3 caracteres")
	@Column(name="tipo_veh", nullable = false, length = 120)
	private String descripcion;
	

	
}
