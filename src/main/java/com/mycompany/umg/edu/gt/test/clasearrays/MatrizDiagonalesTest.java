/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class MatrizDiagonalesTest {
    private static final Logger logger = LogManager.getLogger(MatrizDiagonalesTest.class);

    @Test
    void testEjemplo1() {
        int[][] mat = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };
        int[][] esperado = {
            {1, 1, 1, 1},
            {1, 2, 2, 2},
            {1, 2, 3, 3}
        };

        logger.info("TestEjemplo1 - Matriz original:");
        logMatriz(mat);

        int[][] obtenido = MatrizDiagonales.ordenarDiagonales(mat);

        logger.info("TestEjemplo1 - Matriz obtenida:");
        logMatriz(obtenido);

        logger.info("TestEjemplo1 - Matriz esperada:");
        logMatriz(esperado);

        assertArrayEquals(esperado, obtenido);
    }

    @Test
    void testEjemplo2() {
        int[][] mat = {
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        };
        int[][] esperado = {
            {5, 17, 4, 1, 52, 7},
            {11, 11, 25, 45, 8, 69},
            {14, 23, 25, 44, 58, 15},
            {22, 27, 31, 36, 50, 66},
            {84, 28, 75, 33, 55, 68}
        };

        logger.info("TestEjemplo2 - Matriz original:");
        logMatriz(mat);

        int[][] obtenido = MatrizDiagonales.ordenarDiagonales(mat);

        logger.info("TestEjemplo2 - Matriz obtenida:");
        logMatriz(obtenido);

        logger.info("TestEjemplo2 - Matriz esperada:");
        logMatriz(esperado);

        assertArrayEquals(esperado, obtenido);
    }

    private void logMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            logger.info(Arrays.toString(fila));
        }
    }
}
