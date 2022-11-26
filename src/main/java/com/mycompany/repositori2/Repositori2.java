package com.mycompany.repositori2;

import java.util.Scanner;

/**
 *
 * @author de337
 */
public class Repositori2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("DANIEL ");
        System.out.println("ERICK ");
        System.out.println("HERBER");
        System.out.println("ALEX");
        
        Scanner reader = new Scanner(System.in);
        int num1 = 0;  //aqui estamos crando la primer variable 
        int num2 =0;   //aqui estamos establecindo la segunda variable en este caso un numero
        int num3 =0;
        
        System.out.println("dime un numero ");
        num1 = reader.nextInt(); //estamos pidiento el primer numero
        
        
        System.out.println("dime otro numero");
        num2 = reader.nextInt(); //aqui pedimos el segundo numero 
        
         System.out.println("dime otro numero");
        num3 = reader.nextInt(); //aqui pedimos el segundo numero 
        
        int resultado = num1+num2+num3; // se suman los dos numeros para asi crear la nueva variable que es el resultado 
        
        System.out.println("el resultado de la suma es "+num1+ "+"+num2+ "+" +num3+ "=" +resultado); // aqui imprimimos el rsultado en la consola 
    }
        
        
        
        
    }

