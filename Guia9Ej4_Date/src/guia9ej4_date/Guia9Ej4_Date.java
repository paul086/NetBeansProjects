/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4_date;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author pablo
 */
public class Guia9Ej4_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date fechaNacimiento = FechaService.fechaNacimiento();
        Date fechaActual = FechaService.fechaActual();
        int edad = FechaService.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Su edad es: " + edad + " años");
    }
    
}
