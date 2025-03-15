/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumaMatriz {
    private static final Logger logger = LogManager.getLogger(SumaMatriz.class);

    public static int sumaTotal(int[][] mat) {
        int suma = 0;
        for (int[] fila : mat) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        logger.info("Suma parcial calculada: {}", suma);
        return suma;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] mat2 = {
            {10, 20},
            {30, 40}
        };

        logger.info("Suma total (Ejemplo 1): {}", sumaTotal(mat1));
        logger.info("Suma total (Ejemplo 2): {}", sumaTotal(mat2));
    }
}
