/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajas;

/**
 *
 * @author Jeycon
 */
public class plataforma extends cajaMadre{

    public plataforma(int tiempo) {
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
