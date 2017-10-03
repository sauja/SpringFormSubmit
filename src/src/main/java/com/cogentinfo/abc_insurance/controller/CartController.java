package com.cogentinfo.abc_insurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class CartController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getCart(HttpSession session)
    {
        ModelAndView modelAndView=new ModelAndView();

        return modelAndView;
    }
}
