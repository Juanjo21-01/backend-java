package principal;

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
        // Pedir un numero y ver si es positivo o negativo

        Scanner leerDatos = new Scanner(System.in);

        // variables
        int numero;

        // pedir datos
        System.out.printf("Ingrese un Número: ");
        numero = leerDatos.nextInt();

        // condicional
        if (numero > 0) {
            System.out.println("El Número: " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El Número: " + numero + " es negativo");
        } else {
            System.out.println("El Número: " + numero + " es 0");
        }
    }
}
