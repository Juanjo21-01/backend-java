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

public class Ejercicio1 {

    public static void main(String[] args) {
        // Pedir 2 números y ver si son iguales o no

        Scanner leerDatos = new Scanner(System.in);

        // variables
        int numero1, numero2;

        // pedir datos
        System.out.printf("Ingrese el primer Número: ");
        numero1 = leerDatos.nextInt();
        System.out.printf("Ingrese el segundo Número: ");
        numero2 = leerDatos.nextInt();

        // condicional
        if (numero1 == numero2) {
            System.out.println("El Número: " + numero1 + " y el Número: " + numero2 + " --> son iguales");
        } else {
            System.out.println("El Número: " + numero1 + " y el Número: " + numero2 + " --> No son iguales");
        }
    }
}
