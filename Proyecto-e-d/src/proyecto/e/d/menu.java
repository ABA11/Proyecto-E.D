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
 * @author Jeycon
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
        while(comenzar==true){//While que abarca todo el procedimiento de la simulaciónn
        try{//El try - catch que atrapa errores en la simulación por general    
        boolean inicio = true;
        boolean inicio2 = true;
        logica lg = new logica();//Instancia de la clase logica
        while(inicio == true){//While que abarca la primer ventana de la simulación
            this.menu = Integer.parseInt(JOptionPane.showInputDialog("Elija una de "
                + "las opciones\npara definir cuantas horas trabajara el banco"
                + "\n1 = 8 horas \n2 = 4 horas"));//Mensaje y variable que guarda la opcion deseada por el usuario para el menú siguiente           
        switch(menu){//Menú el cual trata las horas que se desea simular
            case 1:{//Caso uno son 8 horas
                inicio = false;//Boolean false para que pasara esta estapa
                time = 580*6;//Convertimos el tiempo
                lg.centro(time);//Instancia del método centro el cual contiene lo que es el tiempo que se le dara a cada tiquete para su transacción  
            }break;
            case 2:{//Caso dos son 4 horas
                inicio = false;//Boolean false para que pasara esta estapa
                time = 340*6;//Convertimos el tiempo
                lg.centro(time);//Instancia del método centro el cual contiene lo que es el tiempo que se le dara a cada tiquete para su transacción                 
            }break;
            default:{//Caso defaul por si no ingresan un número de caso no esta establecido
                JOptionPane.showMessageDialog(null,"¡ERROR!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
            }
        }   
        }
        //
        while(inicio2==true){//While para cosas secundarias
        try{//El try - catch que atrapa errores para cosas secundarias
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
        switch(menu1){//Menu1 el cual funciona para seleccionar el registro de la caja deseada
            case 1:{//Caso uno para la caja1
                inicio2 = false;//Boolean false para que pasara esta estapa
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 1: "+lg.caja1.size());
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp1/lg.caja1.size())+" Minutos");
            }break;
            case 2:{//Caso dos para la caja2
                inicio2 = false;//Boolean false para que pasara esta estapa
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 2: "+lg.caja2.size());
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp2/lg.caja2.size())+" Minutos");
            }break;    
            case 3:{//Caso tres para la caja3
                inicio2 = false;//Boolean false para que pasara esta estapa
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 3: "+lg.caja3.size());
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp3/lg.caja3.size())+" Minutos");
            }break;
            case 4:{//Caso cuatro para la caja4
                inicio2 = false;//Boolean false para que pasara esta estapa
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 4: "+lg.caja4.size());
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp4/lg.caja4.size())+" Minutos");
            }break;    
            case 5:{//Caso cinco para caja5
                inicio2 = false;//Boolean false para que pasara esta estapa
                System.out.println("Cantidad  de clientes atendidos por "
                        +"caja 5: "+lg.caja5.size());
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp5/lg.caja5.size())+" Minutos");
            }break;    
            case 6:{//Caso seis para plataforma
                inicio2 = false;//Boolean false para que pasara esta estapa
                System.out.println("Cantidad  de clientes atendidos por "
                        +"Plataforma: "+lg.plataforma.size());
                System.out.println("Tiempo promedio por cliente: "
                        +(lg.tp6/lg.plataforma.size())+" Minutos");
            }break;
            default:{//Caso defaul por si no ingresan un número de caso no esta establecido
                JOptionPane.showMessageDialog(null,"¡ERROR!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
            }break;
        }
        //
        int reini = JOptionPane.showConfirmDialog(null,
                 "¿Quieres volver a consultar otra caja?");//Opción que se presenta y pregunta que si desea jugar otra ves
             if(reini==JOptionPane.YES_OPTION){//Sí la opcion es si entonces inicio2 se hace verdadero entonces se regresa a donde se inicio dicho while
                inicio2 = true;
             }else
             if(reini==JOptionPane.NO_OPTION)//Sí la opción es no entonces el inicio2 se hace falso y asi no volver hasta donde era verdadero     
                 inicio2 = false;
        }catch(Exception e){//Sí hay un error en elegir la opcion este atrapa el problema, y vulve a donde inicio2es verdadero y asi vuelve a preguntar
            JOptionPane.showMessageDialog(null,"¡ERROR!","Error"
                    ,JOptionPane.ERROR_MESSAGE);
           inicio2 = true;
        }
        }  
        //
         int reiniciar = JOptionPane.showConfirmDialog(null,
                 "Quieres volver a simular");//Opción que se presenta y pregunta que si desea simular otra ves
             if(reiniciar==JOptionPane.YES_OPTION){//Sí la opcion es si entonces comenzar se hace verdadero entonces se regresa a donde se inicio dicho while
                 comenzar = true;
             }else
             if(reiniciar==JOptionPane.NO_OPTION)//Sí la opción es no entonces elcomenzar se hace falso y asi no volver hasta donde era verdadero     
                 comenzar = false;
             if(reiniciar==JOptionPane.CANCEL_OPTION)
                 comenzar = false;
        }catch(Exception e){//Catch para tratar los posibles errores que pueda tener el proyecto
                JOptionPane.showMessageDialog(null,"¡ERROR DEL SISTEMA!","Error"
                        ,JOptionPane.ERROR_MESSAGE);
        }           
        }
    }
}