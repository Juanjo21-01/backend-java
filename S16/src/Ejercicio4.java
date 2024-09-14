/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chevi
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Leer grados centígrados y pasarlos a fahrenheit
        
        Scanner leerDatos = new Scanner(System.in);
        
        // variables
        float gradosCentigrados, gradosFahrenheit;
        
        // pedir datos
        System.out.printf("Ingrese los grados centígrados: ");
        gradosCentigrados = leerDatos.nextFloat();
        
        gradosFahrenheit = 32 + (9*gradosCentigrados/5);
        
        // mostrar en pantalla
        System.out.println("Grados Centígrados: "+gradosCentigrados);
        System.out.println("Grados Fahrenheit: "+gradosFahrenheit);
    }
}
