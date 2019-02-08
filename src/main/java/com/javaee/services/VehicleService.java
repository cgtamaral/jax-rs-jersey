package com.javaee.services;

import java.util.List;

import com.javaee.services.entities.Vehicle;

public interface VehicleService {

	List<Vehicle> getAll();

	Vehicle findById(Integer id);

	Vehicle saveVehicle(Vehicle vehicle);

	void deleteById(Integer id);
}