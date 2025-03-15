/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class ClaseArraysTest {
    private static final Logger logger = LogManager.getLogger(ClaseArraysTest.class);

    @Test
    void testEjemplo1() {
        int[][] cuentas = {{1,2,3}, {3,2,1}};
        int resultadoEsperado = 6;
        int resultadoObtenido = ClaseArrays.maximaRiqueza(cuentas);

        logger.info("TestEjemplo1 - Resultado esperado: {}, Resultado obtenido: {}", resultadoEsperado, resultadoObtenido);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void testEjemplo2() {
        int[][] cuentas = {{1,5}, {7,3}, {3,5}};
        int resultadoEsperado = 10;
        int resultadoObtenido = ClaseArrays.maximaRiqueza(cuentas);

        logger.info("TestEjemplo2 - Resultado esperado: {}, Resultado obtenido: {}", resultadoEsperado, resultadoObtenido);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void testEjemplo3() {
        int[][] cuentas = {{2,8,7}, {7,1,3}, {1,9,5}};
        int resultadoEsperado = 17;
        int resultadoObtenido = ClaseArrays.maximaRiqueza(cuentas);

        logger.info("TestEjemplo3 - Resultado esperado: {}, Resultado obtenido: {}", resultadoEsperado, resultadoObtenido);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    // Este es el que fallará
    @Test
    void testFalloForzado() {
        int[][] cuentas = {{1,2,3}, {3,2,1}};
        int resultadoEsperado = 5; // Incorrecto intencionalmente
        int resultadoObtenido = ClaseArrays.maximaRiqueza(cuentas);

        logger.warn("TestFalloForzado - ¡Prueba diseñada para fallar! Resultado esperado: {}, Resultado obtenido: {}",
                    resultadoEsperado, resultadoObtenido);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
