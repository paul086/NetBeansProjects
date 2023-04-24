/*
*Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto.
*/
package extra1messecreto;

import Entidad.Mes;
import Service.MesServicio;


public class Extra1MesSecreto {

    public static void main(String[] args) {
        
        
        
        MesServicio servicio = new MesServicio();
        
        Mes mes = servicio.crearMes();
        
        System.out.println( mes.toString());
        
        servicio.comparacion(mes);
        
    }

}
