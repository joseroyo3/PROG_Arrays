/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog_arrays_ej1;

import java.util.Random;

/**
 * @author Jose Royo Andreu
 *
 * Se generan 20 números aleatorios de tipo entero y se almacenan en un vector.
 * Hay que calcular y mostrar la media y, además, mostrar cuántos números hay:
 * -Superiores a la media -Inferiores a la media -Iguales a la media
 */
public class PROG_Arrays_EJ1 {

    public static void main(String[] args) {
        // Declaramos atributos necesarios
        Random random = new Random(); // Crea numero entre 0 (incluido) y 1 (excluido)
        float media = 0; 
        float[] numerosAleatorios = new float[20];

        // Rellenamos la matriz de numeros aleatorios
        media = rellenarMatriz(numerosAleatorios, random, media) / 20; // entre 20 porque son 20 num aleatorios

        System.out.printf("La media es %2.2f\n", media * 100);

        // Método que clasificará los numeros del vector en >, < o = a media
        lugarEnLaMedia(numerosAleatorios, media); //

    }

    public static float rellenarMatriz(float[] numerosAleatorios, Random random, float media) {
        for (int i = 0; i < 20; i++) {
            numerosAleatorios[i] = random.nextFloat();
            media += numerosAleatorios[i];
        }
        return media;
    }

    public static void lugarEnLaMedia(float[] numerosAleatorios, float media) {
        int superiores = 0, inferiores = 0, iguales = 0;
        for (int i = 0; i < 20; i++) {
            if (numerosAleatorios[i] > media) {
                superiores++;
            } else if (numerosAleatorios[i] < media) {
                inferiores++;
            } else {
                iguales++;
            }
        }
        System.out.printf("Hay %d números superiroes, %d inferiroes y %d iguales a la media", superiores, inferiores, iguales);

    }
}
