package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

@Controller
public class CarsConrtoller {

    @GetMapping(value = "/cars")
    public String method(@RequestParam(value = "count", required = false) Integer count, Model model) {

        model.addAttribute("cars", Service.selectCars(count));

        return "/cars";
    }
}
