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

public class Ejercicio3 {

    public static void main(String[] args) {
        // Pedir 2 números y ordenarlos de mayor a menor

        Scanner leerDatos = new Scanner(System.in);

        // variables
        int numero1, numero2;

        // pedir datos
        System.out.printf("Ingrese el primer Número: ");
        numero1 = leerDatos.nextInt();
        System.out.printf("Ingrese el segundo Número: ");
        numero2 = leerDatos.nextInt();

        // condicional
        if (numero1 > numero2) {
            System.out.println("--> " + numero1 + " \n--> " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("--> " + numero2 + " \n--> " + numero1);
        } else {
            System.out.println("--> " + numero1 + " , " + numero2);
        }
    }
}
