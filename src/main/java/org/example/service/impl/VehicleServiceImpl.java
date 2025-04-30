package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Vehicle;
import org.example.entity.VehicleEntity;
import org.example.repository.VehicleRepository;
import org.example.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private final ModelMapper mapper;
    private final VehicleRepository repository;

    @Override
    public List <Vehicle> getall(){
        List<Vehicle> vehicleArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            vehicleArrayList.add(mapper.map(entity, Vehicle.class));
        });
        return vehicleArrayList;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        repository.save(mapper.map(vehicle, VehicleEntity.class));
    }

    @Override
    public Vehicle searchVehicleById(Integer id) {
        return mapper.map(repository.findById(id), Vehicle.class);

    }

    @Override
    public void deleteVehicleById(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateVehicleById(Vehicle vehicle) {
        repository.save(mapper.map(vehicle, VehicleEntity.class));
    }
}
