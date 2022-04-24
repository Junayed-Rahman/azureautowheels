package com.naoshin.azureautomechanic.controller;

import com.naoshin.azureautomechanic.model.Car;
import com.naoshin.azureautomechanic.model.CarCategory;
import com.naoshin.azureautomechanic.repository.CarRepository;
import com.naoshin.azureautomechanic.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(value = {"/buy"})
    public String buy(Model m){
        List<Car> carList = (List<Car>) this.carRepository.findAll();
        List<CarCategory> categoryList = (List<CarCategory>) this.categoryRepository.findAll();
        m.addAttribute("carList",carList);
        m.addAttribute("categoryList",categoryList);
        return "home";
    }

    @GetMapping(value = {"/","/home"})
    public String home(Model m){
        return "newHome";
    }

//    @GetMapping(value = {"/about"})
//    public String about(Model m){
//        return "about";
//    }

}
