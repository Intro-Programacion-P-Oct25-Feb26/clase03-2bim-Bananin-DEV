/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        double[] total = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre del encargado de la estacion " + (i+1) + ": ");
            nombres[i] = entrada.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Produccion mensual de " + nombres[i]);
            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                produccion[i][j] = entrada.nextDouble();
            }
            entrada.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            total[i] = 0;
            for (int j = 0; j < 12; j++) {
                total[i] += produccion[i][j];
            }
        }
        int Mayor = 0;
        for (int i = 1; i < 5; i++) {
            if (total[i] > total[Mayor]) {
                Mayor = i;
            }
        }

        System.out.printf(
                "\nAnálisis de Producción\n\n"
                + "Nombre Estacion 1 - Total Produccion: $ %.2f\n"
                + "Nombre Estacion 2 - Total Produccion: $ %.2f\n"
                + "Nombre Estacion 3 - Total Produccion: $ %.2f\n"
                + "Nombre Estacion 4 - Total Produccion: $ %.2f\n"
                + "Nombre Estacion 5 - Total Produccion: $ %.2f\n\n"
                + "Estacion mas productiva: Nombre Estacion %d\n"
                + "Encargado de la estacion: %s\n"
                + "Cantidad de la estacion mas productiva: $ %.2f\n",
                total[0],
                total[1],
                total[2],
                total[3],
                total[4],
                (Mayor + 1),
                nombres[Mayor],
                total[Mayor]);

    }
}
