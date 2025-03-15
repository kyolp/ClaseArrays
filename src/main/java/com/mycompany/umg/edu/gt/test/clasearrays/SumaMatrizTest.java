/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class SumaMatrizTest {
    private static final Logger logger = LogManager.getLogger(SumaMatrizTest.class);

    @Test
    void testEjemplo1() {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int resultadoEsperado = 45;
        int resultadoObtenido = SumaMatriz.sumaTotal(mat);

        logger.info("TestEjemplo1 - Matriz:");
        logMatriz(mat);
        logger.info("Resultado esperado: {}, Resultado obtenido: {}", resultadoEsperado, resultadoObtenido);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void testEjemplo2() {
        int[][] mat = {
            {10, 20},
            {30, 40}
        };
        int resultadoEsperado = 100;
        int resultadoObtenido = SumaMatriz.sumaTotal(mat);

        logger.info("TestEjemplo2 - Matriz:");
        logMatriz(mat);
        logger.info("Resultado esperado: {}, Resultado obtenido: {}", resultadoEsperado, resultadoObtenido);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void testMatrizUnElemento() {
        int[][] mat = {
            {5}
        };
        int resultadoEsperado = 5;
        int resultadoObtenido = SumaMatriz.sumaTotal(mat);

        logger.info("TestMatrizUnElemento - Matriz:");
        logMatriz(mat);
        logger.info("Resultado esperado: {}, Resultado obtenido: {}", resultadoEsperado, resultadoObtenido);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    private void logMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            logger.info(Arrays.toString(fila));
        }
    }
}
