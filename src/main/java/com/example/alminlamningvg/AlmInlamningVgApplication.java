package com.example.alminlamningvg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlmInlamningVgApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlmInlamningVgApplication.class, args);


        NumberGenerator ng = new NumberGenerator();
        int floorNumber = 100;

        int generatedNumber = ng.generateRandomNumber(floorNumber);
        System.out.println(generatedNumber);
    }
}