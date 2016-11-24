/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajas;
/**
 *
 * @author Jeycon
 **/
public abstract class  cajaMadre {
    public int tiempo;
//
    public cajaMadre(int tiempo) {
        this.tiempo = tiempo;
    }
//
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
//
    public abstract String Caja (String tiquete, int tiempo);     
}
