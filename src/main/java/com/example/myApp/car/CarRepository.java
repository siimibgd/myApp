package com.example.myApp.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Cars, Long> {

    @Query("Select s FROM Cars s where s.plateNumber=?1")
    Optional<Cars> findCarByPlate(String plate);

}
