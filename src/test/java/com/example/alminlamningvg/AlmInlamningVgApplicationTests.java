package com.example.alminlamningvg;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlmInlamningVgApplicationTests {

    @Test
    void contextLoads() {

    }

    NumberGenerator ng = new NumberGenerator();

    @Test
    void generateRandomNumberLessThanInputTest() {
        int testFloorNumber = 10;
        int resultNumber = ng.generateRandomNumber(testFloorNumber);
        assertTrue(resultNumber  > 10);
        //test comment
    }

    @Test
    void generateRandomNumberIsZeroTest(){
        int testNumber = 0;
        int resultNumber = ng.generateRandomNumber(testNumber);
        assertEquals(testNumber, resultNumber);
    }

    @Test
    void generateNegativeNumberTest(){
        int testNumber = -20;
        int resultNumber = ng.generateRandomNumber(testNumber);
        assertTrue(resultNumber <= 0);
    }

}
