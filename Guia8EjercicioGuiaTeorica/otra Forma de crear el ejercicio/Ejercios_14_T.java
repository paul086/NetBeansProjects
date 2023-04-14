/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercios_14_t;

import Entidad.Persona;
import Servicios.PersonaServicios;

/**
 *
 * @author martin
 */
public class Ejercios_14_T {

    public static void main(String[] args) {
        
        PersonaServicios p1 = new PersonaServicios();
        Persona per1 = p1.crearPersona();
       System.out.println(per1.toString());
        
    }
}
