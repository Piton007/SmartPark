package com.smartpark.model.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartpark.model.Ingreso;

public interface IIngresoRepository  extends JpaRepository<Ingreso, Integer>{

}
