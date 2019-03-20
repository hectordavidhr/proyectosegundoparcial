package com.company;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombre;
        String[] Asistentes = new String[3];
        String[] Alumno = new String[20];
        String asignatura ;
        int contador = 0;
        int imprimir =0;
        int enumero= 0;
        System.out.println("\n SISTEMA DE MATRICULA UJCV \n \n ");

        System.out.print("Ingrese el nombre completo del maestro: ");
        nombre = input.nextLine();

        System.out.print("Ingrese el nombre de la asignatura: ");
        asignatura = input.nextLine();


        System.out.print("Ingrese el nombre completo de los 3 asistentes: \n");
        while (contador <= 2) {

            System.out.print("Ingrese el nombre del asistente: ");
            Asistentes[contador] = input.nextLine();
            contador++;

        }


        System.out.print("Ingrese el nombre completo de los 20 Alumnos\n");
        contador = 0 ;

        while (contador <= 19) {



            System.out.print("Ingrese el nombre completo del Alumno: ");
            Alumno[contador] = input.nextLine();
            contador++;

        }

        System.out.print("\n\nCLASE REGISTRADA \n");


        System.out.println("catedratico:   " + nombre);
        System.out.println("Asignatura:  " + asignatura);

        System.out.println("\nASISTENTES:  " + asignatura);

        while (imprimir <= 2) {
            enumero = imprimir +1;

            System.out.print(""+enumero +".  " + Asistentes[imprimir]+"\n");
            imprimir++;

        }

        System.out.print("\nALUMNOS: \n");
        imprimir = 0;

        while (imprimir <= 19) {
            enumero = imprimir +1;

            System.out.print(""+enumero+".  " + Alumno[imprimir]+"\n");
            imprimir++;

        }

    }
}
