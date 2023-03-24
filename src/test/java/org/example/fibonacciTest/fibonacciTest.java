package org.example.fibonacciTest;

import org.example.fibonacci.fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class fibonacciTest {

    fibonacci fibo;
    @BeforeEach
    public void setUp(){
        fibo=new fibonacci();

    }
   @Test
   public void seriesPass(){
       int[] ans = {0, 1, 1, 2, 3};
       assertArrayEquals(ans, fibonacci.fibonacciSeries(5));
   }




    @AfterEach
    public void clear(){
        fibo=null;
    }

}
