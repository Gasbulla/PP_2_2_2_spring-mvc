package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceIml;

@Controller
public class CarController {

        @GetMapping("/cars")
        public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
            ServiceIml serviceIml = new ServiceIml();
            model.addAttribute("count", serviceIml.getCar(count));
            return "cars";
        }

}
