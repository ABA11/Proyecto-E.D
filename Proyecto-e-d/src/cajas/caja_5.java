/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajas;

import java.util.LinkedList;

/**
 *
 * @author Jeycon
 */
public class caja_5 extends cajaMadre{

    public caja_5(int tiempo) {
        super(tiempo);
    }

    @Override
    public String Caja(String tiquete, int tiempo) {
        this.tiempo = tiempo;
        String Caja;
        Caja =( tiquete + tiempo);
        return Caja;
    }
}