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
            System.out.print("Ingrese nombre del encargado de la estación " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Producción mensual de " + nombres[i]);
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
