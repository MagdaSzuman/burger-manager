package com.wandm.burgermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IngredientController {

    @GetMapping("/burger")
    public ModelAndView helloBurger() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @GetMapping("/hello")
    public ModelAndView hello (){
        ModelAndView modelAndView = new ModelAndView("Hello MgSzu");
        return modelAndView;

    }
}
