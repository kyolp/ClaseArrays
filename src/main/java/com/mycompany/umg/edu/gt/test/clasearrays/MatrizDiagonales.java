/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;


import java.util.*;

public class MatrizDiagonales {
    public static int[][] ordenarDiagonales(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> diagonales = new HashMap<>();

        // Agrupar valores por diagonal
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonales.putIfAbsent(i - j, new PriorityQueue<>());
                diagonales.get(i - j).add(mat[i][j]);
            }
        }

        // Reemplazar valores con los ordenados
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = diagonales.get(i - j).poll();
            }
        }

        return mat;
    }
}
