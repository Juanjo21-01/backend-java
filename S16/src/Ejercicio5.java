/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chevi
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Leer radio y calcular la longitud y área
        
        Scanner leerDatos = new Scanner(System.in);
        
        // variables
        float radio;
        double longitud, area;
        // pedir datos
        System.out.printf("Ingrese el Radio: ");
        radio = leerDatos.nextFloat();
        
        longitud = 2 * Math.PI * radio;        
        area = Math.PI * Math.pow(radio, 2);

        // mostrar en pantalla
        System.out.println("Longitud: "+longitud);
        System.out.println("Área: "+area);
    }
}
