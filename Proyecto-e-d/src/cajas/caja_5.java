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
public class caja_5 extends cajaMadre{
    /**
     * Constructor super de caja_5
     * @param tiempo
     **/
    public caja_5(int tiempo) {
        super(tiempo);
    }
    @Override
    public String Caja(String tiquete, int tiempo) {//Método caja 
        this.tiempo = tiempo;
        String Caja;
        Caja =( tiquete + tiempo);
        return Caja;
    }
}