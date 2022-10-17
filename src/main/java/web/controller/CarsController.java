package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    CarsDao carsDao;

    @GetMapping()
    public String getCarsCount(@RequestParam(required = false) Integer count, ModelMap model) {
        int numCars = count == null ? carsDao.getCars().size() : count;
        model.addAttribute("listCars", carsDao.getCars(numCars));
        return "cars";
    }


}
