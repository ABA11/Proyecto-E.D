/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajas;
/**
 *
 * @author Jeycon
 * @author Andrey B
 **/
public abstract class  cajaMadre {
    //Variable de cajaMadre
    public int tiempo;
    /**
     * Constructor de claseMadre
     * @param tiempo
     **/
    public cajaMadre(int tiempo) {
        this.tiempo = tiempo;
    }
    /**
     * Método get de la variable tiempo
     * @return
     **/
    public int getTiempo() {
        return tiempo;
    }
    /**
     * Método set para la variable tiempo
     * @param tiempo
     **/
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    /**
     * Método abstracto de la clase madre
     * @param tiquete
     * @param tiempo
     * @return
     **/
    public abstract String Caja (String tiquete, int tiempo);     
}
