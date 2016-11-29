/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.e.d;
//Importes
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrey B
 * @author Jeycon M
 **/
public class menu {
    //Variables del menu
    int menu = 0;
    int menu1 = 0;
    int time = 0;
   
  
    private List fila;
    //Método para que funcione el menú
    public void principal(){
        boolean comenzar = true;
        
//        boolean empezar = true;
        while(comenzar==true){
        try{    
         boolean inicio = true;
         boolean inicio2 = true;
        logica lg = new logica();
        while(inicio == true){
            this.menu = Integer.parseInt(JOptionPane.showInputDialog("Elija una de "
                + "las opciones\npara definir cuantas horas trabajara el banco"
                + "\n1 = 8 horas \n2 = 4 horas"));
            
        switch(menu){
            case 1:{
                inicio = false;
                time = 580*6;
                lg.centro(time);  
                
            }break;
            case 2:{
                 inicio = false;
                time = 340*6;
                lg.centro(time);
               
            }break;
            default:{
                JOptionPane.showMessageDialog(null,"¡ERROR!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
            }
        }   
        }
         
       
         //
         while(inicio2==true){
             try{
        System.out.println("=================================================");
        System.out.println("La cantidad de clientes que entraron al banco "
                + "fue de: "+ lg.totalP());
        System.out.println("Cantidad de clientes atendidos: "+lg.totalAt());
        System.out.println("Cantidad de clientes sin ser atendidos: "
                +(lg.totalP()-lg.totalAt()));
        System.out.println("==================================================");        
        this.menu1 = Integer.parseInt(JOptionPane.showInputDialog("Registro de "
                + "cajas\n1 = Caja 1\n2 = Caja 2\n3 = Caja 3\n4 = Caja 4"
                + "\n5 = Caja 5\n6 = Plataforma"));
        //
        switch(menu1){
            case 1:{
                inicio2 = false;
                System.out.println(lg.caja1);
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 1: "+lg.caja1.size()+" "+lg.caja1);
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp1/lg.caja1.size())+" Minutos");
            }break;
            case 2:{
                 inicio2 = false;
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 2: "+lg.caja2.size()+" "+lg.caja2);
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp2/lg.caja2.size())+" Minutos");
            }break;    
            case 3:{
                 inicio2 = false;
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 3: "+lg.caja3.size()+" "+lg.caja3);
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp3/lg.caja3.size())+" Minutos");
            }break;
            case 4:{
                 inicio2 = false;
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 4: "+lg.caja4.size()+" "+lg.caja4);
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp4/lg.caja4.size())+" Minutos");
            }break;    
            case 5:{
                 inicio2 = false;
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 5: "+lg.caja5.size()+" "+lg.caja5);
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp5/lg.caja5.size())+" Minutos");
            }break;    
            case 6:{
                 inicio2 = false;
                System.out.println(lg.plataforma);
                System.out.println("Cantidad  de clientes atendidos por "
                        +"Plataforma: "+lg.plataforma.size()+" "+lg.plataforma
                );
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp6/lg.plataforma.size())+" Minutos");
           }break;
            default:{
                JOptionPane.showMessageDialog(null,"¡ERROR!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
            }break;
        }
        int reini = JOptionPane.showConfirmDialog(null,
                 "¿Quieres volver a consultar otra caja?");//Opcion que se presenta y pregunta que si desea jugar otra ves
             if(reini==JOptionPane.YES_OPTION){
                inicio2 = true;
             }else
             if(reini==JOptionPane.NO_OPTION)    
                 inicio2 = false;
               }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"¡ERROR!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
           inicio2 = true;
       }
        }  
         int reiniciar = JOptionPane.showConfirmDialog(null,
                 "Quieres volver a simular");//Opcion que se presenta y pregunta que si desea jugar otra ves
             if(reiniciar==JOptionPane.YES_OPTION){
                 comenzar = true;
             }else
             if(reiniciar==JOptionPane.NO_OPTION)
                 comenzar = false;
             if(reiniciar==JOptionPane.CANCEL_OPTION)
                 comenzar = false;
        }catch(Exception e){ //catch para tratar los posibles errores que pueda tener el proyecto
                JOptionPane.showMessageDialog(null,"¡ERROR DEL SISTEMA!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
        }           
    }
  }
}