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

public class Ejercicio5 {

    public static void main(String[] args) {
        // Pedir dia, mes y año e indicar si la fecha es correcta

        Scanner leerDatos = new Scanner(System.in);

        // variables
        int dia, mes, anio;

        // pedir datos
        System.out.printf("Ingrese el día: ");
        dia = leerDatos.nextInt();
        System.out.printf("Ingrese el mes: ");
        mes = leerDatos.nextInt();
        System.out.printf("Ingrese el año: ");
        anio = leerDatos.nextInt();

        // condicional
        if (mes > 0 && mes < 12) {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 0 && dia <= 30) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
            } else if (mes == 2) {
                if (dia > 0 && dia <= 28) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
            } else {
                if (dia > 0 && dia <= 31) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                }
            }
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
