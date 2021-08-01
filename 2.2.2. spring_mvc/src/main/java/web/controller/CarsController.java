package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    List<Car> listCars = new ArrayList<>();

    @GetMapping("/cars")
    public String getCars(@RequestParam("count") int a, Model model) {
        listCars.add(new Car("Toyota", 250, "Jeep"));
        listCars.add(new Car("Nissan", 109, "Coupe"));
        listCars.add(new Car("BWM", 380, "Sedan"));
        listCars.add(new Car("Lada", 80, "Sedan"));
        listCars.add(new Car("Ferrari", 1200, "Sport-car"));

        List<Car> getNewList = new ArrayList<>();

        for (int i = 0; i < a && i < 5; i++) {
            getNewList.add(listCars.get(i));
        }

        model.addAttribute("listCars", getNewList);
        return "cars";
    }
}
