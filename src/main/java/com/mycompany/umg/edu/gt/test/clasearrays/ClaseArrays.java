/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

package com.mycompany.umg.edu.gt.test.clasearrays;
public class ClaseArrays {
    private static final Logger logger = LogManager.getLogger(ClaseArrays.class);

    public static int maximaRiqueza(int[][] cuentas) {
        int maxRiqueza = 0;

        for (int[] cliente : cuentas) {
            int riquezaCliente = 0;
            for (int banco : cliente) {
                riquezaCliente += banco;
            }
            maxRiqueza = Math.max(maxRiqueza, riquezaCliente);

         
            logger.info("Riqueza del cliente actual: {}", riquezaCliente);
        }

        logger.info("Máxima riqueza encontrada: {}", maxRiqueza);
        return maxRiqueza;
    }
}
