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

public class Ejercicio4 {

    public static void main(String[] args) {
        // Pedir 3 números y mostrar ordenados de mayor a menor

        Scanner leerDatos = new Scanner(System.in);

        // variables
        int numero1, numero2, numero3;

        // pedir datos
        System.out.printf("Ingrese el primer Número: ");
        numero1 = leerDatos.nextInt();
        System.out.printf("Ingrese el segundo Número: ");
        numero2 = leerDatos.nextInt();
        System.out.printf("Ingrese el tercer Número: ");
        numero3 = leerDatos.nextInt();

        // condicional
        if ((numero1 > numero2) && (numero1 > numero3)) {
            if (numero2 > numero3) {
                System.out.println("--> " + numero1 + " \n--> " + numero2 + " \n--> " + numero3);
            } else {
                System.out.println("--> " + numero1 + " \n--> " + numero3 + " \n--> " + numero2);
            }
        } else if ((numero2 > numero1) && (numero2 > numero3)) {
            if (numero1 > numero3) {
                System.out.println("--> " + numero2 + " \n--> " + numero1 + " \n--> " + numero3);
            } else {
                System.out.println("--> " + numero2 + " \n--> " + numero3 + " \n--> " + numero1);
            }
        } else if ((numero3 > numero1) && (numero3 > numero2)) {
            if (numero1 > numero2) {
                System.out.println("--> " + numero3 + " \n--> " + numero1 + " \n--> " + numero2);
            } else {
                System.out.println("--> " + numero3 + " \n--> " + numero2 + " \n--> " + numero1);
            }
        } else {
            System.out.println("--> " + numero1 + " , " + numero2 + " , " + numero3);
        }
    }
}
