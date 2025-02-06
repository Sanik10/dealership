package com.dealership.service;

import com.dealership.model.Car;
import com.dealership.repository.CarRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.io.LineNumberInputStream;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car findById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        return car.orElse(null);
    }

    public Car update(Long id, Car car) {
        if (carRepository.existsById(car.getId())) {
            car.setId(id);
            return carRepository.save(car);
        } else {
            return null;
        }
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
