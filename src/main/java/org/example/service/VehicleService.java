package org.example.service;

import org.example.dto.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getall();

    void addVehicle(Vehicle vehicle);

    Vehicle searchVehicleById(Integer id);

    void deleteVehicleById(Integer id);

    void updateVehicleById(Vehicle vehicle);
}
