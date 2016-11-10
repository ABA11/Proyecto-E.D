/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.e.d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Andrey B
 */
public class logica {
    private String[] prioridad = {"A","B","C","D","E","F"};
    private int contador = 0;
    int tiempo1,tiempo2,tiempo3,tiempo4,tiempo5,tiempo6 = 0;
    int tp1,tp2,tp3,tp4,tp5,tp6 = 0;
    private int x = 0;
    List<String> fila = new ArrayList<>(); 
    LinkedList caja1 = new LinkedList();
    LinkedList caja2 = new LinkedList();
    LinkedList caja3 = new LinkedList();
    LinkedList caja4 = new LinkedList();
    LinkedList caja5 = new LinkedList();
    LinkedList plataforma = new LinkedList();
    //
    public String tiquetes(){            
        x = (int) (Math.random()*6);
        String tiquetes = prioridad[x] ;      
        return tiquetes;
    }
    //
    public void puta(){                   
        while(fila.size() < 25 && contador < 200){
            tp1 += (tiempo1 = tiempos());
            tp2 += (tiempo2 = tiempos());
            tp3 += (tiempo3 = tiempos());
            tp4 += (tiempo4 = tiempos());
            tp5 += (tiempo5 = tiempos());
            tp6 += (tiempo6 = tiempos());
            contador += tiempo1 + tiempo2 + tiempo3 + tiempo4 + tiempo5 +tiempo6;
            for (int i = 0; fila.size() < 25; i++) {
                fila.add(tiquetes());
            }
        }
    }
    //
    public int tiempos(){
        int tiempos = 0;
        while((tiempos != 30) && (tiempos != 5)){
             tiempos = ((int) (Math.random()*31+4));
        } 
        return tiempos;
    }
}