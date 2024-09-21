/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
public class arregloMultiplos {
    //array de 10 posiciones con multiplos de 5
    public static void main(String[] args) {
        int multiplos[] = new int[10];
        int cont = 0;
       
        for (int i = 0; i < multiplos.length; i++) {
            cont += 5;
            multiplos[i] = cont;

            System.out.println("Arreglo de multiplos de 5: " + multiplos[i]);
        }
    }
}
