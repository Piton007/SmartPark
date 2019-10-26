package com.smartpark.model.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartpark.model.Vehiculo;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Integer>{

}
