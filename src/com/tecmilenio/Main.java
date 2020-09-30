package com.tecmilenio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Nombre;
        int promedio=0, suma=0;
        int arrayCalificaciones []= new int[5];
        Scanner entrada = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {
            System.out.println("Ingresa la calificación");
            arrayCalificaciones [x] = entrada.nextInt();
        }

        for (int x = 0; x<5; x++) {
            suma = arrayCalificaciones[x] + suma;
        }

        promedio= suma/5;
        System.out.println("Promedio:"+promedio);

        for (int x=0; x<5;x++)
        System.out.println("Calificacion "+(x+1)+":"+arrayCalificaciones[x]);

        if (promedio<=50) {
            System.out.println("F");
        } else
            if (promedio>50 & promedio<61){
            System.out.println("E");
        }else
            if (promedio>60 & promedio<71){
            System.out.println("D");
        }else if (promedio>70 & promedio<81){
            System.out.println("C");
        }else if (promedio>80 & promedio<91){
            System.out.println("B");
        }else if (promedio>90){
            System.out.println("A");
        }
    }
}