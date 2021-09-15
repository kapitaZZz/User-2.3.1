package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",required = false) Integer count, ModelMap model){
        List<Car> cars;
        if (count == null || count >= 5) {
            cars = carService.getAllCars();
            model.addAttribute("messages", cars);
        } else {
            cars = carService.getCertainNumberOfCars(count);
            model.addAttribute("messages", cars);
        }
        return "cars";
    }
}