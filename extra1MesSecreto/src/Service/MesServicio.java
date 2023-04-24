/*
*Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto.
 */
package Service;

import Entidad.Mes;
import java.util.Random;
import java.util.Scanner;

public class MesServicio {

    public Mes crearMes() {
        Random random = new Random();
        //String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String[] mes = new String[12];
        mes[0]="enero";
        mes[1]="febrero";
        mes[2]="marzo";
        mes[3]="abril";
        mes[4]="mayo";
        mes[5]="junio";
        mes[6]="julio";
        mes[7]="agosto";
        mes[8]="septiembre";
        mes[9]="octubre";
        mes[10]="noviembre";
        mes[11]="diciembre";
        String mesSecreto;
        mesSecreto = mes[random.nextInt(12)];
       
        String aux="";
        for(String elemento : mes ){
             aux += " " + elemento;
            
        }
        System.out.println(aux );
        //fore es el avanzado
        System.out.println(mesSecreto);
        return new Mes(mes, mesSecreto);
    }

    public void comparacion(Mes mes) {
        Scanner leer = new Scanner(System.in);
        String resp;

        do {

            System.out.println("Ingrese mes.");
            resp = leer.next();
            
            if (resp.equals(mes.getMesSecreto())) {
                System.out.println("Correcto!");
                break;
            } else {
                System.out.println("Incorrecto, vuelva a intentarlo");
            }

        } while (true);

    }

}
