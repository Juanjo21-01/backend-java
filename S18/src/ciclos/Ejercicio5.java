package ciclos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chevi
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // Crear Pirámide

        int cantidad = 10;
        for (int i = 1; i <= cantidad; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" --> " + i);
        }
    }
}
