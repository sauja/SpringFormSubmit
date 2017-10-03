package com.cogentinfo.abc_insurance.controller;


import com.cogentinfo.abc_insurance.model.UserLogin;
import com.cogentinfo.abc_insurance.service.user.UserService;
import com.cogentinfo.abc_insurance.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/health")
public class HealthHomePageController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public ModelAndView initController(HttpSession session) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("healthhomepage");
        return modelAndView;
    }
    @RequestMapping(value = "findUser", method = RequestMethod.GET)
    public ModelAndView findUser(HttpSession session, @ModelAttribute UserLogin userLogin) {

        ModelAndView modelAndView=new ModelAndView();
        List<UserLogin> userLoginList=userService.findByEmail(userLogin.getEmail());
        modelAndView.addObject("userLoginList",userLoginList);
        modelAndView.setViewName("healthhomepage");
        return modelAndView;
    }

}
