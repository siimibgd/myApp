package com.example.myApp.car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("cars", new Cars());
        return "form";  // Assuming your Thymeleaf template is named "form.html"
    }

    @GetMapping("/cars")
    public List<Cars> getCars() {
        return carService.getCars();
    }

    @PostMapping("/form")
    public void registerNewCar(@RequestBody Cars cars) {
        carService.addNewCar(cars);
    }
}
