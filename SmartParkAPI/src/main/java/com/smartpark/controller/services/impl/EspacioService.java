package com.smartpark.controller.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartpark.controller.services.IEspacioService;
import com.smartpark.model.Espacio;
import com.smartpark.model.respository.IEspacioRepository;

@Service
public class EspacioService implements IEspacioService {

	@Autowired
	private IEspacioRepository espacioRepository;
	
	@Override
	public Espacio registrar(Espacio t) {
		// TODO Auto-generated method stub
		return espacioRepository.save(t);
	}

	@Override
	public Espacio modificar(Espacio t) {
		// TODO Auto-generated method stub
		return espacioRepository.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		espacioRepository.deleteById(id);
	}

	@Override
	public Optional<Espacio> listarId(int id) {
		// TODO Auto-generated method stub
		return espacioRepository.findById(id);
	}

	@Override
	public List<Espacio> listar() {
		// TODO Auto-generated method stub
		return espacioRepository.findAll();
	}
	
	

}
