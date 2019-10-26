package com.smartpark.controller.services;

import java.util.List;
import java.util.Optional;

public interface ICrudService<T> {

	
	T registrar(T t);
	T modificar(T t);
	
	void eliminar(int id);
	
	Optional<T> listarId(int id);
	
	List<T> listar();
}
