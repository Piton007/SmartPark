package com.smartpark.controller.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartpark.controller.services.IIngresoService;
import com.smartpark.model.Ingreso;
import com.smartpark.model.respository.IEspacioRepository;
import com.smartpark.model.respository.IIngresoRepository;

@Service
public class IngresoService implements IIngresoService {

	@Autowired
	private IIngresoRepository ingresoRepository;

	@Override
	public Ingreso registrar(Ingreso t) {
		// TODO Auto-generated method stub
		return ingresoRepository.save(t);
	}

	@Override
	public Ingreso modificar(Ingreso t) {
		// TODO Auto-generated method stub
		return ingresoRepository.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		ingresoRepository.deleteById(id);
		
	}

	@Override
	public Optional<Ingreso> listarId(int id) {
		// TODO Auto-generated method stub
		return ingresoRepository.findById(id);
	}

	@Override
	public List<Ingreso> listar() {
		// TODO Auto-generated method stub
		return ingresoRepository.findAll();
	}
	
	
	
}
