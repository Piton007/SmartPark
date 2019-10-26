package com.smartpark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "Tarifa")
@Data
public class Tarifa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tarifa_id;
	
	@Column(name = "Costo_Tarifa",nullable=false)
	private double costo_tarifa;
	
	@Size(min=3, message = "El tipo de vehiculo mínimo 3 caracteres")
	@Column(name="tipo_veh", nullable = false, length = 20)
	private String tipo_veh;
	
	@ManyToOne
	@JoinColumn(name = "cod_parking",nullable=false)
	private Parking parking;
	
	
}
