package com.telusko.app.service;

import com.telusko.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("Method called");
    }

    public boolean isGoodForProgramming(Laptop lap){
return true;
    }
}
