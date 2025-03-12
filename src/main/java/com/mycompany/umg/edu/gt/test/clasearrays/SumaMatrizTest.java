/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumaMatrizTest {

    @Test
    void testEjemplo1() {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertEquals(45, SumaMatriz.sumaTotal(mat));
    }

    @Test
    void testEjemplo2() {
        int[][] mat = {
            {10, 20},
            {30, 40}
        };
        assertEquals(100, SumaMatriz.sumaTotal(mat));
    }

    @Test
    void testMatrizUnElemento() {
        int[][] mat = {
            {5}
        };
        assertEquals(5, SumaMatriz.sumaTotal(mat));
    }
}
