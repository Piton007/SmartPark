package com.smartpark.controller.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartpark.controller.services.IAdministradorService;
import com.smartpark.model.Administrador;
import com.smartpark.model.respository.IAdministradorRepository;

@Service
public class AdministradorService implements IAdministradorService {

	
	@Autowired
	private IAdministradorRepository administradorRepository;
	@Override
	public Administrador registrar(Administrador t) {
		// TODO Auto-generated method stub
		return administradorRepository.save(t);
	}

	@Override
	public Administrador modificar(Administrador t) {
		// TODO Auto-generated method stub
		return administradorRepository.save(t);
	}

	@Override
	public void eliminar(int id) {
		 administradorRepository.deleteById(id);
		
	}

	@Override
	public Optional<Administrador> listarId(int id) {
		// TODO Auto-generated method stub
		return administradorRepository.findById(id);
	}

	@Override
	public List<Administrador> listar() {
		// TODO Auto-generated method stub
		return administradorRepository.findAll();
	}

}
