package com.restapi.Rest_API_With_Docker.service;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements OperationService{

    List<Integer> ls;

    public ServiceImpl(){
    ls= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
    }

    @Override
    public List<Integer> sort() {
        
        Collections.sort(this.ls);

        return ls;

    }

    @Override
    public List<Integer> reverselist() {
        
        Collections.reverse(this.ls);
        
        return ls;
    }

    @Override
    public List<Integer> storestring(List<Integer> ls) {
        this.ls= new ArrayList<>(ls);
        return this.ls;
    }


}
