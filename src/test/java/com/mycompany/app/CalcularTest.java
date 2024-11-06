package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalcularTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testSumar() {
        long resultado = calculadora.sumar(33, 44);
        assertTrue(resultado == 77);
    }

    @Test
    void testMultiplicar() {
        long resultado = calculadora.restar(45, 5);
        assertTrue(resultado == 40);
    }

    @Test
    void testRestar() {
        assertTrue(calculadora.multiplicar(5, 9) == 45);
    }

    @Test
    void testDividir() {
        assertTrue(calculadora.dividir(20, 5) == 4);
    }
}
