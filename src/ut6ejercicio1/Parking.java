/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut6ejercicio1;

/**
 *
 * @author dam
 */
public class Parking {
    
    String[]plazas;

    public Parking(){
       plazas = new String[100];
    }
    
    public Parking(int numeroPlazas){
       plazas = new String[numeroPlazas];
    }
    
    public void inicializarPlazas(){
        for(int nplazas = 0;nplazas < plazas.length; nplazas++){ //declaramos la varibale dentro del buble para que solo exista ahi dentro
            plazas[nplazas] = "LIBRE";
        }
    }
    
    public void visualizar(){
        //plazas[1] = "OCUPADA";
        System.out.println("Nº plaza Estado");
        for(int nplazas = 0;nplazas < plazas.length; nplazas++){
            System.out.println(nplazas + " " + plazas[nplazas]);;
        }
    }
    
    
}
