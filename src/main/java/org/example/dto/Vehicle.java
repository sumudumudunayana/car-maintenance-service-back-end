package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Vehicle {
    private int vehicleId;
    private String vehicleModel;
    private int vehicleYear;
    private String vehicleRegistrationNumber;
}
