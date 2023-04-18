
package guia9;

import Servicios.FechaService;
import java.util.Date;

public class Guia9_Ej4 {



    public static void main(String[] args) {
        Date fechaNacimiento = FechaService.fechaNacimiento();
        Date fechaActual = FechaService.fechaActual();
        int edad = FechaService.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Su edad es: " + edad + " años");
    }
}
