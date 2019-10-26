package com.smartpark.controller.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartpark.controller.services.IComprobanteService;
import com.smartpark.model.Comprobante;
import com.smartpark.model.respository.IComprobanteRepository;
@Service
public class ComprobanteService implements IComprobanteService {

	
	@Autowired
	private IComprobanteRepository comprobanteRepository;
	
	@Override
	public Comprobante registrar(Comprobante t) {
		// TODO Auto-generated method stub
		return comprobanteRepository.save(t);
	}

	@Override
	public Comprobante modificar(Comprobante t) {
		// TODO Auto-generated method stub
		return comprobanteRepository.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		comprobanteRepository.deleteById(id);
		
	}

	@Override
	public Optional<Comprobante> listarId(int id) {
		// TODO Auto-generated method stub
		return comprobanteRepository.findById(id);
	}

	@Override
	public List<Comprobante> listar() {
		// TODO Auto-generated method stub
		return comprobanteRepository.findAll();
	}

}
