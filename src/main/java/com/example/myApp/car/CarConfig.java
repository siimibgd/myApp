package com.example.myApp.car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repository){

        return args -> {
            Cars cars= new Cars(
                    "TM01TMT",
                    "volvo",
                    "v",
                    "v",
                    2000,
                    2000,
                    "v",
                    2000,
                    2000,
                    2000,
                    2000
            );
            Cars cars1= new Cars(
                    "TM01TMT",
                    "volvo",
                    "v",
                    "v",
                    2000,
                    2000,
                    "v",
                    2000,
                    2000,
                    2000,
                    2000
            );
            repository.saveAll(List.of(cars,cars1));
        };
    }
}
