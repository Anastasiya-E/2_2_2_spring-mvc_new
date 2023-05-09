package web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiseImpl;

@Controller
public class CarController {

    @Autowired
    private CarServiseImpl carService;

    @GetMapping("/cars")
    public String getCarsList(@RequestParam(name = "count", required = false) Integer count, Model model) {

        List<Car> carList = carService.getAllCars();

        if (count != null && count >= 1 && count < 5) {
            carList = carList.subList(0, count);
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}
