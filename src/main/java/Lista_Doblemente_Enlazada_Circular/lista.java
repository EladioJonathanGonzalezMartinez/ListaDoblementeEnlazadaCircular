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
public class lista {

    Scanner teclado = new Scanner(System.in);
    nodo primero;
    nodo ultimo;
    int dato;

    public lista() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(int x) {
        nodo nuevo = new nodo();
        nuevo.datos = x;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
    }
    
    public void mostrar(){
        nodo actual = new nodo();
        actual = primero;
        do{
            System.out.println(actual.datos);
            actual = actual.siguiente;
        }while(actual!=primero);
    }
    
    public void buscar(int x){
        nodo actual = new nodo();
        actual = ultimo;
        boolean encontrar = false;
        do{
            if (actual.datos==x) {
                encontrar = true;
                dato=actual.datos;
            }
            actual = actual.anterior;
        }while(actual!=ultimo);
        if (encontrar==true) {
            System.out.println("Nodo encontrando");
            System.out.println(dato);
        } else{
            System.out.println("Nodo no encontrado");
        }
    }
    
    public void modificar(int x) {
        nodo actual = new nodo();
        actual=primero;
        do{
            if (actual.datos==x) {
                System.out.println("Ingrese un nuevo valor");
                actual.datos = teclado.nextInt();          
            }
            actual = actual.siguiente;
        }while(actual!=primero);
    }
}
