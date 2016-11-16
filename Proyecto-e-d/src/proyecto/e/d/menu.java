/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.e.d;

import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrey B
 **/
public class menu {
    int menu = 0;
    int menu1 = 0;
    int time = 0;
  //
    private List fila;
    public void principal(){
        logica lg = new logica();
        this.menu = Integer.parseInt(JOptionPane.showInputDialog("Elija una de "
                + "las opciones\npara definir cuantas horas trabajara el banco"
                + "\n1 = 8 horas \n2 = 4 horas"));
        switch(menu){
            case 1:
                time = 480*6;
                lg.centro(time);             
              
            case 2:
                time = 240*6;
                lg.centro(time);
        }
        System.out.println("La cantidad de clientes que entraron al banco "
                + "fue de: "+ lg.totalP());
        System.out.println("Cantidad de clientes atendidos: "+lg.totalAt());
        System.out.println("Cantidad de clientes sin ser atendidos: "
                +(lg.totalP()-lg.totalAt()));
        //        
        this.menu1 = Integer.parseInt(JOptionPane.showInputDialog("Registro de "
                + "cajas\n1 = Caja 1\n2 = Caja 2\n3 = Caja 3\n4 = Caja 4"
                + "\n5 = Caja 5\n6 = Plataforma"));
        switch(menu1){
            case 1:{
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 1: "+lg.caja1.size());
            }break;
            case 2:{
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 2: "+lg.caja1.size());
            }break;    
            case 3:{
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 3: "+lg.caja1.size());
            }break;
            case 4:{
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 4: "+lg.caja1.size());
            }break;    
            case 5:{
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 5: "+lg.caja1.size());
            }break;    
            case 6:{
                System.out.println("Cantidad  de clientes atendidos por "
                        +"Plataforma: "+lg.caja1.size());
           }break;
        } 
    }
}