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
public class NodoMusic {
    Cancion dato; 
    NodoMusic enlace;
    
    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner (System.in).nextLine());
    }
    
    public Lista crearLista(){
        int x=0;
        primero = null;
        do{
            x=leerEntero();
            if (x != -1){
                primero= new Nodo (x,primero);
                
            }
        }while (x != -1);
        return this;
    }
    
    public Lista insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo= new Nodo (entrada);
        nuevo.enlace= primero;
        return this;
    }
    
    public void visualizar (){
        Nodo n; 
        int k = 0;
        n= primero;
        while (n!=null){
            System.out.println(n.dato + "");
            n = n.enlace;
            k++;
            System.out.println((k%15 !=0 ? "": "\n"));
        }

    }
    
}
