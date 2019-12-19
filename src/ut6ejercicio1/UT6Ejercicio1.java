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
public class UT6Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking artesano = new Parking(5);
        int opcion;
        Numero n = new Numero();
        artesano.inicializarPlazas();
        menu(); //desde un metodo estatico solo puedo llamar a otro metodo estatico
        opcion = n.pedirNumero("", 1, 4);
        while(opcion != 4){
            switch(opcion){
                case 1: 
                    artesano.entrada();
                    break;
                case 2:
                    break;
                case 3:
                    artesano.visualizar();
            }
            menu();
            opcion = n.pedirNumero("", 1, 4); 
        }
    }//d
    
    public static void menu(){ //un metodo estatico es comun para todos los objetos de esa clase
        System.out.println("\n\n1. ENTRADA");
        System.out.println("2. SALIDA");
        System.out.println("3. ESTADO DEL PARKING");
        System.out.println("4. FIN");
        System.out.println("OPCION :");
    }
}
