package com.smartpark.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Ingreso_Servicio")
@Data
public class IngresoServicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_ingreso_servicio;

	@ManyToOne
	@JoinColumn(name = "cod_registro",nullable=false)
	private Ingreso ingreso;
	
	@ManyToOne
	@JoinColumn(name = "cod_servicio",nullable=false)
	private Servicio servicio;

}
