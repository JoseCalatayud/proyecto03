package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testDividir() {
        assertTrue(calculadora.sumar(33, 44) == 77);
    }

    @Test
    void testMultiplicar() {
        assertTrue(calculadora.restar(45, 5) == 40);
    }

    @Test
    void testRestar() {
        assertTrue(calculadora.multiplicar(5, 9) == 45);
    }

    @Test
    void testSumar() {
        assertTrue(calculadora.dividir(20, 5)==4);
    }
}
