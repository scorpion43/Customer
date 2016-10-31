package com.example.Controller;

import com.example.Entity.Customer;
import com.example.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.Collection;


/**
 * Created by Mazek on 29.10.2016.
 */

@Controller
public class CustomerController{

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/info")
    public Collection<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeCustomerById(@PathVariable("id") int id){
        customerService.removeCustomerById(id);
    }

//    @RequestMapping("/add")
//    public String addCustomer(@ModelAttribute("form") @Valid FormDTO form, BindingResult result){
////        if(!result.hasErrors()){
////            customerService.addCustomer(form.getName(), form.getLastName());
////        }
//        return "form";
//
//    }

//    @RequestMapping("/form")
//    public ModelAndView form(){
//        ModelAndView mav = new ModelAndView("form");
//        return mav;
//    }

//    @RequestMapping()
//    public String customer(){
//        return "form";
//    }
}
