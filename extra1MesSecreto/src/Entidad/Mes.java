/*
*
*/
package Entidad;


public class Mes {
    
    private String[] mes;
    
    private String mesSecreto;

    public Mes() {
    }

    public Mes(String[] mes, String mesSecreto) {
        this.mes = mes;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Mes{" + "mes=" + mes + ", mesSecreto=" + mesSecreto + '}';
    }

    
    
    
    

}
