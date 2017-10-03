package com.cogentinfo.abc_insurance.controller;

import com.cogentinfo.abc_insurance.exception.LoginException;
import com.cogentinfo.abc_insurance.model.Cart;
import com.cogentinfo.abc_insurance.model.UserDetails;
import com.cogentinfo.abc_insurance.model.UserLogin;
import com.cogentinfo.abc_insurance.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/")
public class LoginController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView homePage(HttpSession session) {
        ModelAndView model = new ModelAndView();
        if(session.getAttribute("userLogin")!=null)
        {
            model.setViewName("test");
            return model;
        }
        model.addObject("userLogin", new UserLogin());
        model.setViewName("test");
        return model;
    }
    @RequestMapping(value = "/signUpPage", method = RequestMethod.GET)
    public ModelAndView signUpPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("userLogin", new UserLogin());
        model.addObject("userDetails", new UserDetails());
        model.addObject("cart", new Cart());
        model.setViewName("signup");
        return model;
    }
    @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
    public ModelAndView checkLogin(HttpSession session,@ModelAttribute("userLogin") UserLogin userLogin)
    {
        ModelAndView model = new ModelAndView();
        try{
            userLogin= userService.checkLogin(userLogin.getEmail(),userLogin.getPassword());
            model.addObject("email", userLogin.getEmail());
            session.setAttribute("userLogin",userLogin);
            session.setAttribute("cart",userLogin.getCart());
            model.addObject("userLogin", userLogin);
            model.setViewName("home");
            System.out.println("login successful");

        }
        catch (LoginException e)
        {
            model.addObject("error", e.toString());
            model.setViewName("login");
            System.out.println("login failed");

        }
        return model;
    }
    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public ModelAndView signup(HttpSession session,@ModelAttribute("userLogin") UserLogin userLogin)
    {

        ModelAndView modelAndView=new ModelAndView();
        try{
            UserLogin userLogin1=userService.addUserLogin(userLogin.getEmail(),userLogin.getPassword());
            modelAndView.addObject("email", userLogin.getEmail());
            session.setAttribute("userLogin",userLogin1);
            session.setAttribute("cart",userLogin1.getCart());
            modelAndView.setViewName("home");

        }
        catch (LoginException e)
        {
            modelAndView.setViewName("login");

        }
        return modelAndView;
    }
}
