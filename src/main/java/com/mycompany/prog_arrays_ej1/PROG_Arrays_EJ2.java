/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog_arrays_ej1;

import java.util.Arrays;

/**
 *
 * @author Jose Royo Andreu
 *
 * Crear dos vectores de dimensión 10 con números enteros aleatorios entre 1 y
 * 10. Posteriormente construir un tercer vector, e imprimirlo, cuyos
 * componentes sean la suma de los dos anteriores.
 */
public class PROG_Arrays_EJ2 {

    public static void main(String[] args) {

        int[] vec1 = new int[10];
        int[] vec2 = new int[10];
        Arrays.setAll(vec1, (i) -> (int) (Math.random() * 10));
        Arrays.setAll(vec2, (i) -> (int) (Math.random() * 10));

        int[] vecSuma = new int[10];

        for (int i = 0; i < 10; i++) {
            vecSuma[i] = vec1[i] + vec2[i];
        }

        for (int i : vec1) {
            System.out.println("Vector 1 = " + vec1[i]);
            System.out.println("Vector 2 = " + vec2[i]);
            System.out.println("Resultado = " + vecSuma[i] + "\n");
        }
    }
}
