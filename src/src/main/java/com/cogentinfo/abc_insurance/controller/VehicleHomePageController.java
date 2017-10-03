package com.cogentinfo.abc_insurance.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/vehicle")
public class VehicleHomePageController {
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public ModelAndView initController(HttpSession session) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("vehiclehomepage");
        return modelAndView;
    }

}
