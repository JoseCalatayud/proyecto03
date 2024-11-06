package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalcularTest {
    Calculadora calculadora = new Calculadora();
    TablaMultiplicar tabla = new TablaMultiplicar();
    

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

    @Test
    void testDividirDivisionPorCero() {
        try {
            calculadora.dividir(20, 0);
            fail("Se espera salte una excepcion por division por cero");

        } catch (ArithmeticException e) {
            // TODO: handle exception

        }
    }

    @Test
    void presentarTablaDeMultiplicar() {
        int numero = 7;
        int[] tablaEsperada = new int[10];
        for (int i = 1; i <= tablaEsperada.length; i++) {
            tablaEsperada[i - 1] = i * numero;
        }
        // int [] tablaEsperada =
        // {1*numero,2*numero,3*numero,4*numero,5*numero,6*numero,7*numero,8*numero,9*numero,10*numero};
        assertArrayEquals(tablaEsperada, tabla.tablaNumero(numero));

    }
    @Test
    void testMenu(){
        assertTrue(tabla.menu(4)==4);
    }

}
