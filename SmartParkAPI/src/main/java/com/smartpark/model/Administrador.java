package com.smartpark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Administrador")
@Data
public class Administrador {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_administrador;
	
	
	@Column(name = "contraseña",nullable=false,length=20)
	private String contraseña;
	
	@Column(name = "contraseña",nullable=false,length=20)
	private String apellido;
	
	@Column(name = "contraseña",nullable=false,length=20)
	private String nombre;
}
