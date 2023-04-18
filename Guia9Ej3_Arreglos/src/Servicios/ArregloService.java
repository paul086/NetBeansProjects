/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class ArregloService {

    public void inicializarA(double[] arregloA) {
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextInt(10);

        }

    }

    public void mostrar(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {

            System.out.println(arregloA[i]);
        }
    }

    public void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        double num3 = 0.5;
        Arrays.fill((arregloB), num3);
        for (int i = 0; i < 10; i++) {
            
            arregloB[i] = arregloA[i];

        }
        }    
        

    public void mostrar2(double[] arregloA, double[] arregloB) {
        System.out.println("Vector A"); 
        for (int i = 0; i < arregloA.length; i++) {

            System.out.println(arregloA[i]);
        }
        System.out.println(" ");
        System.out.println("Vector B"); 
        for (int i =0; i <  arregloB.length; i++) {

            System.out.println(arregloB[i]);
        }
    }


   
   
    
}
