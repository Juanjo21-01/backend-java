package ciclos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chevi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Tablas de multiplicar del 1 al 10

        int i = 1;
        int j = 1;
        while (i <= 10) {
            System.out.println("\nTabla del " + i);
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + i * j);
                j++;
            }
            j = 1;
            i++;
        }
    }
}
