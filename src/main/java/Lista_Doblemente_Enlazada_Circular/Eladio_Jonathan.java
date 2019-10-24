/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Doblemente_Enlazada_Circular;

import java.util.Scanner;

/**
 *
 * @author remix
 */
public class Eladio_Jonathan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner list = new Scanner(System.in);
        lista listas = new lista();
        int opcion=0;
        do{
            System.out.println("Elija una opcion");
            System.out.println("1.- Ingresa un dato");
            System.out.println("2.- Mostrar lista");
            System.out.println("3.- Buscar en la lista");
            System.out.println("4.- Modificar");
            System.out.println("5.- Salir");
            opcion = list.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("--------Ingrese un dato--------");
                    int dato = list.nextInt();
                    listas.ingresar(dato);
                    break;
                case 2:
                    System.out.println("--------Mostrar Lista--------");
                    listas.mostrar();
                    break;
                case 3:
                    System.out.println("--------Buscar--------");
                    System.out.println("Ingrese el valor a buscar");
                    int datoB = list.nextInt();
                    listas.buscar(datoB);
                    break;
                case 4:
                    System.out.println("--------Modificar--------");
                    System.out.println("Ingrese el dato a modificar");
                    int datom = list.nextInt();
                    listas.modificar(datom);
                    break;
                case 5:
                    break;    
                    
            }
        }while(opcion!=5);
    }
    
}
