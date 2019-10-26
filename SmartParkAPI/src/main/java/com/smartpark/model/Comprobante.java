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
@Table(name = "Espacio")
@Data
public class Comprobante {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_boleta;
	
	@ManyToOne
	@JoinColumn(name = "cod_registro",nullable=false)
	private Ingreso registro;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="H_fin", nullable = false)
	private Date H_fin;
	
	@Column(name="monto", nullable = false)
	private double monto;
	
}
