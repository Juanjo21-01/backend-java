/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chevi
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Leer dos numeros enteros en el teclado y mostrarlos en pantalla
        
        Scanner leerDatos = new Scanner(System.in);
        
        // variables
        String nombre;
        
        // pedir datos
        System.out.printf("Ingrese su Nombre: ");
        nombre = leerDatos.next();
      
        // mostrar en pantalla
        System.out.println("Buenos días "+nombre);             
    }
}
