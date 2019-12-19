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
import numero.Numero;
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
    /**
     * busqueda secuencial. ecuentra el primer valor igual a libre
     * @return posicion donde se encuentra el primer valor igual a libre, -1 en caso contrario
     */
    public int busquedaSecuencial(){
        int nplazas = 0;
        boolean encontrado = false;
        while(nplazas < plazas.length && !encontrado){ //encontrado == false
            if(plazas[nplazas].equals("LIBRE")){
		encontrado = true;
            }else{
		nplazas++;
            }
        }
        if(!encontrado){
            nplazas = -1;
        }
        return nplazas;
    }
    
    public void entrada(){
        int nplaza;
        nplaza = busquedaSecuencial();
	if(nplaza == -1){
            System.out.println("PARKING COMPLETO");
	}else{
            plazas[nplaza] = "OCUPADO";
            System.out.println("LA PLAZA ASIGNADA: " + nplaza);
	}
    }
    
    public void salida(){
        Numero n = new Numero();
        int nplaza;
        nplaza = n.pedirNumero("introduzca la plaza a dejar libre", 0, 4);
        if(plazas[nplaza].equals("OCUPADO")){
            System.out.println("PLAZA LIBRE");
            plazas[nplaza] = "LIBRE";
        }else{
            System.out.println("LA PLAZA YA ESTA LIBRE");
        }
    }
}
