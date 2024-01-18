package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import  java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
   private List<Customer>custmerlist = new ArrayList<>();

   private int custmerIdCounter = 1;

   //create
    @PostMapping("/create")
    public Customer createCustmer(@RequestBody Customer customer){
        customer.setId(custmerIdCounter++);
        custmerlist.add(customer);
        return customer;
    }

    @GetMapping("/all")
    public List<Customer>getALLCustomer(){
        return custmerlist;
    }
//    GetMapping("/customerId")
//        public Optional<Customer>
}