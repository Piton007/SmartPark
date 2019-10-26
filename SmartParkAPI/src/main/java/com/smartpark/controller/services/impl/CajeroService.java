package com.smartpark.controller.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartpark.controller.services.ICajeroService;
import com.smartpark.model.Cajero;
import com.smartpark.model.respository.ICajeroRepository;

@Service
public class CajeroService implements ICajeroService
{
	@Autowired
	private ICajeroRepository cajeroRepository;

	@Override
	public Cajero registrar(Cajero t) {
		// TODO Auto-generated method stub
		return cajeroRepository.save(t);
	}

	@Override
	public Cajero modificar(Cajero t) {
		// TODO Auto-generated method stub
		return cajeroRepository.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		cajeroRepository.deleteById(id);
	}

	@Override
	public Optional<Cajero> listarId(int id) {
		// TODO Auto-generated method stub
		return cajeroRepository.findById(id);
	}

	@Override
	public List<Cajero> listar() {
		// TODO Auto-generated method stub
		return cajeroRepository.findAll();
	}

	

	
}
