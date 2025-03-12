/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClaseArraysTest {

    @Test
    void testEjemplo1() {
        int[][] cuentas = {{1,2,3}, {3,2,1}};
        assertEquals(6, ClaseArrays.maximaRiqueza(cuentas));
    }

    @Test
    void testEjemplo2() {
        int[][] cuentas = {{1,5}, {7,3}, {3,5}};
        assertEquals(10, ClaseArrays.maximaRiqueza(cuentas));
    }

    @Test
    void testEjemplo3() {
        int[][] cuentas = {{2,8,7}, {7,1,3}, {1,9,5}};
        assertEquals(17, ClaseArrays.maximaRiqueza(cuentas));
    }

    // este es el que fallara 
    @Test
    void testFalloForzado() {
        int[][] cuentas = {{1,2,3}, {3,2,1}};
        assertEquals(5, ClaseArrays.maximaRiqueza(cuentas)); 
    }
}
