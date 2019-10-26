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
@Table(name = "Vehiculo")
@Data

public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_vehiculo;
	
	@Size(min=3, message = "El nombre del vehiculo mínimo 3 caracteres")
	@Column(name="nombre", nullable = false, length = 20)
	private String nombre;
	
	
	@Size(min=3, message = "El tipo del vehiculo debe tener mínimo 3 caracteres")
	@Column(name="tipo_vehiculo", nullable = false, length = 20)
	private String tipo_vehiculo;
	
}
