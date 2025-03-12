/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg.edu.gt.test.clasearrays;

public class ClaseArrays {
    public static int maximaRiqueza(int[][] cuentas) {
        int maxRiqueza = 0;
        
        for (int[] cliente : cuentas) {
            int riquezaCliente = 0;
            for (int banco : cliente) {
                riquezaCliente += banco;
            }
            maxRiqueza = Math.max(maxRiqueza, riquezaCliente);
        }
        
        return maxRiqueza;
    }
}