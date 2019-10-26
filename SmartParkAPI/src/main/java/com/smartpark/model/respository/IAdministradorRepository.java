package com.smartpark.model.respository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.smartpark.model.Administrador;
public interface IAdministradorRepository extends JpaRepository<Administrador, Integer> {

}
