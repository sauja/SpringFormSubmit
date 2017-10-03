package com.cogentinfo.abc_insurance.controller;

import com.cogentinfo.abc_insurance.model.UserDetails;
import com.cogentinfo.abc_insurance.model.UserLogin;
import com.cogentinfo.abc_insurance.repository.UserDetailsRepo;
import com.cogentinfo.abc_insurance.service.user.UserDetailsService;
import com.cogentinfo.abc_insurance.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
@SessionAttributes("userDetails")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsRepo userDetailsRepo;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView initController(HttpSession session) {
        ModelAndView model = new ModelAndView();
        UserLogin userLogin= (UserLogin) session.getAttribute("userLogin");
        System.out.println("emai "+userLogin.getEmail()+" id "+userLogin.getId());
        model.addObject("userDetails",userLogin.getUserDetails());
        model.setViewName("account");
        return model;
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView addUserDetails(HttpSession session,@ModelAttribute("userDetails") UserDetails userDetails,BindingResult userloginResult) {
        ModelAndView model = new ModelAndView();
        System.out.println(userDetails.getFirstName());
        UserLogin userLogin= (UserLogin) session.getAttribute("userLogin");
        userDetails.setId(userLogin.getUserDetails().getId());
        userLogin.setUserDetails(userDetails);
        userService.modifyUserLogin(userLogin);

        model.setViewName("home");
        return model;
    }
}
