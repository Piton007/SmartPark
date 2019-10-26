package com.smartpark.controller.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartpark.controller.services.IIngresoServicioService;
import com.smartpark.model.Ingreso;
import com.smartpark.model.respository.IIngresoRepository;

@Service
public class IngresoServicio implements IIngresoServicioService {
	@Autowired
	private IIngresoRepository ingresoRepository;

	@Override
	public IngresoServicio registrar(IngresoServicio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.smartpark.model.IngresoServicio modificar(com.smartpark.model.IngresoServicio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<com.smartpark.model.IngresoServicio> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.smartpark.model.IngresoServicio> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
	
	
	
	

}
