package org.example.classs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 44;
        assertEquals(resultadoEsperado, calculadora.sumar(22, 22));

    }

    @Test
    void restar() {
        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 100;
        assertEquals(resultadoEsperado, calculadora.restar(200, 100));
    }

    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        double excpectedRes = 103.96;
        assertEquals(excpectedRes, calculadora.multiplicar(22.6, 4.6));

    }

    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        double expexRes = 35.7;
        assertEquals(expexRes, calculadora.dividir(71.4, 2));
    }
}