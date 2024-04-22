package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
    //%%%%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el dia");
        int dia =sc.nextInt();
         System.out.println("ingrese el mes");
        int mes =sc.nextInt();
         System.out.println("ingrese el anno");
        int anno = sc.nextInt();
        
        Fecha fechas = new Fecha (dia , mes , anno);
        if(fechas.fechava()){
            System.out.println("fecha es valida ");
        }
        else
        {
            System.out.println(fechava.fechaLarga());
        }
    }       
}
