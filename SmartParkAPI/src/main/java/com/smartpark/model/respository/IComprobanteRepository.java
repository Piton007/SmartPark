package com.smartpark.model.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartpark.model.Comprobante;

public interface IComprobanteRepository extends JpaRepository<Comprobante, Integer> {

}
