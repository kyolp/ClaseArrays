/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;


import java.util.*;
import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrizDiagonales {
    private static final Logger logger = LogManager.getLogger(MatrizDiagonales.class);

    public static int[][] ordenarDiagonales(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> diagonales = new HashMap<>();

        logger.info("Matriz original:");
        for (int[] fila : mat) {
            logger.info(Arrays.toString(fila));
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonales.putIfAbsent(i - j, new PriorityQueue<>());
                diagonales.get(i - j).add(mat[i][j]);
            }
        }

        logger.info("Diagonales antes de ordenar:");
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : diagonales.entrySet()) {
            logger.info("Diagonal {} -> {}", entry.getKey(), entry.getValue());
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = diagonales.get(i - j).poll();
            }
        }

        logger.info("Matriz después de ordenar diagonales:");
        for (int[] fila : mat) {
            logger.info(Arrays.toString(fila));
        }

        return mat;
    }
}
