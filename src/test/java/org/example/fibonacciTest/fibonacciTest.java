package org.example.fibonacciTest;

import org.example.fibonacci.fibonacci;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class fibonacciTest {

    fibonacci fibo;
    @BeforeEach
    public void setUp(){
        fibo=new fibonacci();

    }





    @AfterEach
    public void clear(){
        fibo=null;
    }

}
