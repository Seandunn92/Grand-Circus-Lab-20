package com.SeanDunn.controller;


import com.SeanDunn.util.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

/**
 * Created by seandunn92 on 5/8/17.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView indexPage(){
        return new ModelAndView("index", "", "");
    }

    @RequestMapping(value ="/Cust", method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("customer", "command", new Customer());
    }

    @RequestMapping (value = "/addCustomer", method = RequestMethod.POST)
    public String addStudent(Customer customer, Model model){
        System.out.println("Hey!!!!" + customer.getFirstName());
        model.addAttribute("first", customer.getFirstName());
        model.addAttribute("coffeeChoice", customer.getCoffeeChoice());

        return "result";
    }
}

