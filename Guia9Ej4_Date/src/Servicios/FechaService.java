/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;


import java.util.Date;
import java.util.Scanner;

public class FechaService {
    /*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su
nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El 
método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new 
Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. 
Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date 
fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la
diferencia de años entre una y otra (edad del usuario).
*/

    
    public static Date fechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (en formato dd/mm/yyyy): ");
        String fecha = sc.nextLine();
        String[] partesFecha = fecha.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // se resta 1 al mes ya que en Java los meses comienzan en 0
        int anio = Integer.parseInt(partesFecha[2]) - 1900; // se resta 1900 al año ya que en Java el año 0 es 1900
        return new Date(anio, mes, dia);
    }
    
    public static Date fechaActual() {
        return new Date();
    }
    
    public static int diferencia(Date fecha1, Date fecha2) {
        long diff = fecha2.getTime() - fecha1.getTime();
        long diffYears = diff / (24 * 60 * 60 * 1000) / 365; // calcula la diferencia en años
        return (int) diffYears;
    }
}
