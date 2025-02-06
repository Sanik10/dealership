package com.dealership.repository;

import com.dealership.model.Car;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    // доп методы для работы с данными
}