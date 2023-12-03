package com.example.myApp.car;

import io.micrometer.common.lang.NonNull;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public List<Cars> getCars(){
        return  carRepository.findAll();
    }

    public void addNewCar(@NonNull Cars cars) {
    Optional<Cars> carsOptional =carRepository
            .findCarByPlate(cars.getPlateNumber());
    if(carsOptional.isPresent()){
        throw new IllegalStateException("plate taken");
    }
    carRepository.save(cars);
    }
}
