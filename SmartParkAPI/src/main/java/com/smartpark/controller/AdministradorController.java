package com.smartpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/almacen")
@Api(tags = "Almacen", value = "Servicio Web RESTFul de Almacen")
public class AdministradorController {

	@Autowired
	private IAlmacenService almacenService;
	
	
	
	
}
