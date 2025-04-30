package org.example.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.dto.Vehicle;
import org.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("vehicle")
@RequiredArgsConstructor
public class VehicleController {
    @Autowired
    final VehicleService service;

    @GetMapping("/get-all")
    public List<Vehicle> getVehicle() {
        return service.getall();
    }

    @PostMapping("/add-vehicle")
    public void addVehicle(@Valid @RequestBody Vehicle vehicle){
        service.addVehicle(vehicle);
    }

    @GetMapping("/search-by-id/{id}")
    public Vehicle getVehicleById(@PathVariable Integer id){
        return service.searchVehicleById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteVehicleById(@PathVariable Integer id){
        service.deleteVehicleById(id);
    }

    @PutMapping("/update-vehicle")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateVehicle(@RequestBody Vehicle vehicle){
        service.updateVehicleById(vehicle);
    }

}
