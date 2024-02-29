package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void testAdicao() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.adicao(-2, 1));
        assertEquals(10, calc.adicao(5, 5));
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtracao(5, 3));
        assertEquals(-3, calc.subtracao(0, 3));
    }

    @Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicacao(2, 3));
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2.5, calc.divisao(5, 2), 0.001);
    }
}