/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chevi
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Leer dos numeros enteros en el teclado y mostrarlos en pantalla
        
        Scanner leerDatos = new Scanner(System.in);
        
        // variables
        int numero1, numero2;
        
        // pedir datos
        System.out.printf("Ingrese el primer Número: ");
        numero1 = leerDatos.nextInt();
        System.out.printf("Ingrese el segundo Número: ");
        numero2 = leerDatos.nextInt();
        
        // mostrar en pantalla
        System.out.println("Primer Número ingresado: "+numero1);
        System.out.println("Segundo Número ingresado: "+numero2);
    }
}
