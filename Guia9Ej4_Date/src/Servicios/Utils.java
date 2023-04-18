/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static final String FORMATO_FECHA = "dd/MM/yyyy";

    public static Date parsearFecha(String fecha) {
        try {
            return new SimpleDateFormat(FORMATO_FECHA).parse(fecha);
        } catch (ParseException e) {
            System.out.println("Error al parsear fecha: " + fecha);
            return null;
        }
    }

    public static String formatearFecha(Date fecha) {
        return new SimpleDateFormat(FORMATO_FECHA).format(fecha);
    }
}
