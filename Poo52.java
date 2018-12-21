/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author masacr3
 */
public class Poo52 {

    /**
     * @param msg
     * @param args the command line arguments
     */
    
    public static void print(Object msg){
        System.out.println(msg);
    }
    
    public static void Msg(Object msg){
        System.out.print(msg);
    }
    
    public static int aleatorio(int inf,int sup) {
        //genera un n° aleatorio comprendio dentro del intervalo [inf,sup], extremos incluidos
        Random rand = new Random(); 
        return  (int) (rand.nextDouble() * 8 + 1);//rand.nextInt((sup - inf) + 1) + inf;
    }
    
    public static int Sumar(List<Integer> lista){
        
        int res = 0;
        Iterator it = lista.iterator();
        
        while( it.hasNext()){
            res += (int)it.next();
        }
        return res;
    }
    
    
    public static void ejercicio1(){
        List<String> compañeros = new ArrayList<>();
        String nombres[] = {"marto","mati","nacho","alberto","martin","gabriela"};
        
        int i = 0;
        
        for( String compañero: nombres){
            compañeros.add(compañero);
        }
        
        Iterator iter_for_compañeros = compañeros.iterator();
        Iterator iter_while_compañeros = compañeros.iterator();
        
        while (iter_while_compañeros.hasNext()){
            print(iter_while_compañeros.next());
        }
        
        print("");
        for (;iter_for_compañeros.hasNext();){
            print(iter_for_compañeros.next());
        }
    }
    
    public static void ejercicio2(){
        List<Integer> listaNumeros = new ArrayList<>();
        int k = 20;
        
        for (int i=0; i<k; i++){
            listaNumeros.add(aleatorio(0,100));
        }
        
        int maximo = Collections.max(listaNumeros);
        int minimo = Collections.min(listaNumeros);
        int suma = Sumar(listaNumeros);
        int media = suma / listaNumeros.size();
        
        print("suma : "+suma);
        print("maximo : "+maximo);
        print("minimo : "+minimo);
        print("media : "+media);
        
    }
    
    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        int i = 1;
        while (i <= 10){
            Msg("Ingrese numero "+i+" : ");
            listaNumeros.add(teclado.nextInt());
            i++;
        }
        
        
        Iterator it = listaNumeros.iterator();
        
        print("estos numeros ingreso:");
        while (it.hasNext()) { print(it.next());}
        
        Collections.sort(listaNumeros);
        
        Iterator it2 = listaNumeros.iterator();
        print("numeros ordenados");
        while(it2.hasNext()) { print(it2.next());}
 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
    }
    
}
