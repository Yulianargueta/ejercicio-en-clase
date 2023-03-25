/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

import Listas.Lista;
import Listas.Nodo;
import java.util.Scanner;

/**
 *
 * @author PC-ELHID
 */
public class ListaCancion {
    
    public NodoMusic primero;
    
    public ListaCancion (){
        primero = null;
    }
    
    private Cancion cancion(){
        
    }
    
    private String leerCancion(){
        System.out.println("Ingrese valor, -1 para terminar");
        return (new Scanner (System.in).nextLine());
    }
    
    
    public ListaCancion crearLista(){
        String x;
        primero = null;
        do{
            x=leerEntero();
            if (x != null){
                primero= new NodoMusic (x,primero);
                
            }
        }while (x != null);
        return this;
    }
}
