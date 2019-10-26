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
@Table(name = "Espacio")
@Data
public class Espacio {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_espacio;

	@ManyToOne
	@JoinColumn(name = "cod_cajero",nullable=false)
	private Cajero cajero;
	
	@Column(name = "identificador",nullable=false,length=9)
	private String identificador;
	
	@Column(name = "disponibilidad",nullable=false)
	private boolean disponibilidad;
	
	
	@ManyToOne
	@JoinColumn(name = "cod_parking",nullable=false)
	private Parking parking;
	
	
}
