/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej3_arreglos;

import Entidades.Arreglos;
import Servicios.ArregloService;

/**
 *
 * @author pablo
 */
public class Guia9Ej3_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService SC = new ArregloService();
        Arreglos uno = new Arreglos();
        SC.inicializarA(arregloA);
        SC.mostrar(arregloA);
        SC.ordenar(arregloA);
        //SC.inicializarA(arregloB);
        System.out.println(" ");
        
        SC.inicializarB(arregloA, arregloB);
        SC.mostrar2(arregloA, arregloB);
    }

}
