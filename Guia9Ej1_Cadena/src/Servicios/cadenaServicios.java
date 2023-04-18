/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como
 * atributos una frase (String) y su longitud. Agregar constructor vacío y con
 * atributo frase solamente. Agregar getters y setters. El constructor con frase
 * como atributo debe setear la longitud de la frase de manera automática. Crear
 * una clase CadenaServicio en el paquete servicios que implemente los
 * siguientes métodos: a) Método mostrarVocales(), deberá contabilizar la
 * cantidad de vocales que tiene la frase ingresada. b) Método invertirFrase(),
 * deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo:
 * Entrada: "casa blanca", Salida: "acnalb asac". c) Método vecesRepetido(String
 * letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas
 * veces se repite el carácter en la frase, por ejemplo: d) Entrada: frase =
 * "casa blanca". Salida: El carácter 'a' se repite 4 veces. e) Método
 * compararLongitud(String frase), deberá comparar la longitud de la frase que
 * compone la clase con otra nueva frase ingresada por el usuario. f) Método
 * unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
 * con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a”
 * que se encuentren en la frase, por algún otro carácter seleccionado por el
 * usuario y mostrar la frase resultante. h) Método contiene(String letra),
 * deberá comprobar si la frase contiene una letra que ingresa el usuario y
 * devuelve verdadero si la contiene y falso si no.
 *
 * @author usand
 */
public class cadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena frase;

    public void mostrarVocales() {
        int cont = 0;
        System.out.println("Ingresar frase");
        frase = new Cadena(leer.nextLine());

        for (int i = 0; i < frase.getLargo(); i++) {

            char vocal = frase.getFrase().toLowerCase().charAt(i);

            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);
    }

    public void invertirFrase() {
        System.out.println("\nSe invertira la frase\n");

        for (int i = frase.getLargo() - 1; i >= 0; i--) {
            char vocal = frase.getFrase().charAt(i);
            System.out.print(vocal);
        }
        System.out.println("");
    }

    public void vecesRepetido(String letra) {
        int cont = -1;

        for (int i = 0; i < frase.getLargo(); i++) {
            char car = frase.getFrase().toLowerCase().charAt(i);

            if (letra.equals(String.valueOf(car))) {

                cont++;
            }
        }
        System.out.println("La cantidad de veces que repite (" + letra + ") es: " + cont + " vez/veces");
    }

    public void compararLongitud(String relato) {
        int longi = relato.length();
        if (longi == frase.getLargo()) {
            System.out.println("La longitud de las frases son iguales");

        } else {
            System.out.println("La longitud de las frases no son iguales");
        }
    }

    public void unirFrases(String frasecita) {

        System.out.println(frase.getFrase().concat(frasecita));
    }

    public void reemplazar(String letra) {
            String vocal = frase.getFrase();
            String frase2 = vocal.replace("a", letra).replace("A", letra);
        System.out.println(frase2);
            
        /* for (int i = 0; i < frase.getLargo(); i++) {

            String vocal = frase.getFrase().toLowerCase().substring(i, i + 1);

            if (vocal.equals("a")) {

                vocal = letra;
            }
            System.out.print(vocal);
        }
        System.out.println("");
        o usamos esto 
        public void reemplazar(Cadena fra){
        System.out.println("Por quecaracter queres reemplazar las a");
        String car = sc.next();
        String frase1 = fra.getFrase();
        String frase2 = frase1.replace("a", car).replace("A", car);
        System.out.println(frase2);
        
    }
       
         */
    }

    public void contiene(String letra) {
        boolean contiene = false;

        for (int i = 0; i < frase.getLargo(); i++) {

            String vocal = frase.getFrase().toLowerCase().substring(i, i + 1);

            if (vocal.equals(letra)) {
                contiene = true;
            }

        }
        System.out.println("\nLa condicion de que este la letra " + letra + ""
                + " en la frase " + frase.getFrase() + " es " + contiene);
    }
}

/*public void reemplazar(Cadena fra){
        System.out.println("Por quecaracter queres reemplazar las a");
        String car = sc.next();
        String frase1 = fra.getFrase();
        String frase2 = frase1.replace("a", car).replace("A", car);
        System.out.println(frase2);
        
    }
public static boolean contiene(Cadena cadena, char letra) {
        return cadena.getFrase().indexOf(letra) != -1;

El método indexOf() devuelve el índice, dentro del objeto String que realiza la llamada, 
de la primera ocurrencia del valor especificado,
comenzando la búsqueda desde indiceDesde ; o -1 si no se encuentra dicho valor.

public void reemplazar(Cadena fra){
        System.out.println("Por quecaracter queres reemplazar las a");
        String car = sc.next();
        String frase1 = fra.getFrase();
        String frase2 = frase1.replace("a", car).replace("A", car);
        System.out.println(frase2);
        
    }
System.out.print("Ingrese un carácter: ");
        char letra = scanner.next().charAt(0);
        CadenaServicio.vecesRepetido(cadena, letra);
*/
