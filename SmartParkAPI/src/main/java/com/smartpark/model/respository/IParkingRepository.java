package com.smartpark.model.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartpark.model.Parking;

public interface IParkingRepository  extends JpaRepository<Parking, Integer>{

}
