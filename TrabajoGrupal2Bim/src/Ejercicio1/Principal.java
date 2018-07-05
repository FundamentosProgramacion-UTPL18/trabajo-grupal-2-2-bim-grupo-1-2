/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Carlos Juca
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] nombre = {"José", "María", "Ana", "Paul", "David"};                    //Se declaran los arrays y se pone valores
        String[] apellido = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edad = {20, 19, 20, 19, 25};
        double[] nota1 = {9.1, 10, 8, 7, 9.1};
        double[] nota2 = {6.1, 5, 10, 7.2, 4.1};
        Estudiantes[] paralelo = new Estudiantes[5];                                    //Se instancia la clase Estudiantes y se crea el obejto paralelo

        for (int i = 0; i < paralelo.length; i++) {                                     // Inicio del ciclo For que recorrera paralelo
            Estudiantes e = new Estudiantes();                                          // Se declara un Objeto llamado e
            e.nombres = nombre[i];                                                      // Agrego cada atributo al objeto
            e.apellidos = apellido[i];
            e.edad = edad[i];
            e.calificacion1 = nota1[i];
            e.calificacion2 = nota2[i];
            paralelo[i] = e;                                                            // Agrego el obejeto al arreglo
        }

        for (int i = 0; i < paralelo.length; i++) {                                     // Presentacion de Resultados
            Estudiantes e = paralelo[i];
            System.out.printf("%s %s\n", e.nombres, e.apellidos);
            System.out.printf("Edad - %d \n", e.edad);
            System.out.printf("Calificacion 1: %.1f\n", e.calificacion1);
            System.out.printf("Calificacion 2: %.1f\n", e.calificacion2);
            System.out.printf("Promedio: %.2f\n", (e.calificacion1 + e.calificacion2) / 2);
        }

    }

}
