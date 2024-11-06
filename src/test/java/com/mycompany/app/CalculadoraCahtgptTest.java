package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculadoraCahtgptTest {
    // Creamos una instancia de la clase Calculadora
    private final Calculadora calculadora = new Calculadora();

    // Test de la suma
    @Test
    public void testSumar() {
        long resultado = calculadora.sumar(5, 3);
        assertEquals(8, resultado, "La suma no es correcta");
    }

    // Test de la resta
    @Test
    public void testRestar() {
        long resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, "La resta no es correcta");
    }

    // Test de la multiplicación
    @Test
    public void testMultiplicar() {
        long resultado = calculadora.multiplicar(5, 3);
        assertEquals(15, resultado, "La multiplicación no es correcta");
    }

    // Test de la división
    @Test
    public void testDividir() {
        float resultado = calculadora.dividir(6, 3);
        assertEquals(2.0f, resultado, "La división no es correcta");
    }

    // Test de la división por cero
    @Test
    public void testDividirPorCero() {
        try {
            calculadora.dividir(6, 0);
            fail("Se esperaba una excepción por división por cero");
        } catch (ArithmeticException e) {
            // Esperamos que se lance una ArithmeticException
            assertEquals("/ by zero", e.getMessage());
        }
    }

    // Test de la división con números negativos
    @Test
    public void testDividirConNumerosNegativos() {
        float resultado = calculadora.dividir(-6, 3);
        assertEquals(-2.0f, resultado, "La división con números negativos no es correcta");
    }
}
