/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chevi
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Leer un número entero y se muestra el doble y triple del número
        
        Scanner leerDatos = new Scanner(System.in);
        
        // variables
        int numero;
        
        // pedir datos
        System.out.printf("Ingrese el primer Número: ");
        numero = leerDatos.nextInt();
        
        // mostrar en pantalla
        System.out.println("Número: "+numero);
        System.out.println("Número doble: "+(numero*2));
        System.out.println("Número triple: "+(numero*3));
    }
}
