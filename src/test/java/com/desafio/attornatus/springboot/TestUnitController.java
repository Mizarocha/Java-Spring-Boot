package com.desafio.attornatus.springboot;

import com.desafio.attornatus.springboot.controller.TestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit(){
        TestController controller = new TestController();
        String resultado = controller.saudacao("ARTEMIZA");
        assertEquals("Ola sou, ARTEMIZA", resultado);


    }
}
