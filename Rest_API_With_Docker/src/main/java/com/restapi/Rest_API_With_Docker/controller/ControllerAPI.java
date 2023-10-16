package com.restapi.Rest_API_With_Docker.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.Rest_API_With_Docker.service.OperationService;

@RestController
@RequestMapping("/listoperations")
public class ControllerAPI {
    
    @Autowired
    private OperationService opservice;


    //Sorts the Integer array to output the sorted version
    @GetMapping("/sort")
    public List<Integer> sortList(){
        
    List<Integer> result = this.opservice.sort();

    return result;
    }

    //Enter an array in the input(JSON format) if you want to replace default array
    @PostMapping("/string")
    public List<Integer> stringinput(@RequestBody int[] ls){
    
    //List<Integer> ls2 = Arrays.asList(ls.split(",")).stream().map(s -> Integer.parseInt(s.trim())).collect(Collectors.toList());
    List<Integer> ls2= Arrays.stream(ls).boxed().toList();

    return this.opservice.storestring(ls2);

    }

    //Reverse the array 
    @GetMapping("/reverse")
    public List<Integer> reverseList(){
    
    
    List<Integer> result = this.opservice.reverselist();

    return result;
    }
}
