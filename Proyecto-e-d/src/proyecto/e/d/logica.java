/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.e.d;
//Importes
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Andrey B
 */
public class logica {
    private String[] prioridad = {"A","B","C","D","E","F"};
    private static int a,b,c,d,e,f;
    private int[] ntiquetes = {a,c,b,d,f,e};   
    private int contador = 0;
    private int tiempo = 0;
    private int tiempo1,tiempo2,tiempo3,tiempo4,tiempo5,tiempo6;
    int tp1,tp2,tp3,tp4,tp5,tp6 = 0;
    private int x = 0;
    //fila
    List<String> fila = new ArrayList<>(); 
    //listas cajas
    LinkedList caja1 = new LinkedList();
    LinkedList caja2 = new LinkedList();
    LinkedList caja3 = new LinkedList();
    LinkedList caja4 = new LinkedList();
    LinkedList caja5 = new LinkedList();
    LinkedList plataforma = new LinkedList();
    //
    public String tiquetes(){            
        x = (int) (Math.random()*6);
        String tiquetes = (prioridad[x]) ; 
        return tiquetes;
    }
    //
    public int tiempos(){
        int tiempos = 0;    
        tiempos = ((int) (Math.random()*31+4));      
        return tiempos;
    }
    //
    public int totalP(){
        int total = caja1.size() + caja2.size() + caja3.size() + caja4.size()
                +caja5.size() + plataforma.size() + fila.size();
        return total;
    }
    //
    public int totalAt(){
        int totalAt = caja1.size() + caja2.size() + caja3.size() + caja4.size()
                +caja5.size() + plataforma.size();
        return totalAt;
    }
    public void centro(int time){                   
        while(contador < time){
            tiempo1 = tiempos();
            tiempo2 = tiempos();
            tiempo3 = tiempos();
            tiempo4 = tiempos();
            tiempo5 = tiempos();
            tiempo6 = tiempos();
            contador += tiempo1 + tiempo2 + tiempo3 + tiempo4 + tiempo5 +tiempo6;
            for (int i = 0; fila.size() < 25; i++) {
                fila.add(tiquetes());
            }
            
            if(("A".equals(fila.get(0)))||("C".equals(fila.get(0)))){
                this.caja1(fila,tiempo1);
                 tp1 += tiempo1;
                 fila.remove(0);
            }if (("C".equals(fila.get(0)))|| ("A".equals(fila.get(0)))){
                this.caja2(fila,tiempo2);
                tp2 += tiempo2;
                fila.remove(0); 
            }if("B".equals(fila.get(0))){
                this.caja3(fila,tiempo3);
                tp3 += tiempo3;
                fila.remove(0); 
            }if(("D".equals(fila.get(0)))||("F".equals(fila.get(0)))){
                this.caja4(fila,tiempo4);
                tp4 += tiempo4;
                fila.remove(0); 
           }if(("F".equals(fila.get(0)))||("D".equals(fila.get(0)))){
                this.caja5(fila,tiempo5);
                tp5 += tiempo5;
                fila.remove(0); 
           }if("E".equals(fila.get(0))){          
               this.plataforma(fila,tiempo6);
               tp6 += tiempo6;
               fila.remove(0); 
           }
        }
    }
     //
    public void caja1(List fila, int tiempo){             
        cajas.caja_1 c1 = new cajas.caja_1(0);
        caja1.add(c1.Caja(valueOf(fila.get(0)),tiempo)+ (ntiquetes[0]++)+ " ");
        
    }
    public void caja2(List fila, int tiempo){
        cajas.caja_2 c2 = new cajas.caja_2(0);    
        caja2.add(c2.Caja(valueOf(fila.get(0)),tiempo)+ (ntiquetes[1]++)+ " ");
       
    }
    public void caja3(List fila, int tiempo){
        cajas.caja_3 c3 = new cajas.caja_3(0);    
        caja3.add(c3.Caja(valueOf(fila.get(0)),tiempo)+ (ntiquetes[2]++)+ " ");
      
    }
    public void caja4(List fila, int tiempo){
        cajas.caja_4 c4 = new cajas.caja_4(0);    
        caja4.add(c4.Caja(valueOf(fila.get(0)),tiempo)+ (ntiquetes[3]++)+ " ");
        
    }
    public void caja5(List fila, int tiempo){
        cajas.caja_5 c5 = new cajas.caja_5(0);    
        caja5.add(c5.Caja(valueOf(fila.get(0)),tiempo)+ (ntiquetes[4]++)+ " ");
        
    }
    public void plataforma(List fila, int tiempo){
        cajas.plataforma pl = new cajas.plataforma(0);    
        plataforma.add(pl.Caja(valueOf(fila.get(0)),tiempo)+ (ntiquetes[5]++)+ " ");
        
    }
}