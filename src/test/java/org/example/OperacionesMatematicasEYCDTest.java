package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasEYCDTest {

    @Test
    void calcularRaizCuadrada(){
        double num1 = 100;
        double resultadoEsperado = 10;

        OperacionesMatematicasEYCD operacionesMatematicas = new OperacionesMatematicasEYCD();
        double resultado = operacionesMatematicas.calcularRaizCuadrada(num1);
        assertEquals(resultadoEsperado,resultado);
    }

}