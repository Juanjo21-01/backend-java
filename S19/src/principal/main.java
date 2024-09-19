/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Objetos
        Cuenta cuenta1 = new Cuenta("Juan", 500.00);
        Cuenta cuenta2 = new Cuenta("Pedro", 300.00);

        Scanner info = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n-----MENU PRINCIPAL-----");
            System.out.println("1. DEPOSITAR DINERO");
            System.out.println("2. RETIRAR DINERO");
            System.out.println("3. VER SALDOS");
            System.out.println("4. SALIR DEL PROGRAMA");
            int opcion = info.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n-----DEPOSITAR-----");
                    System.out.println("1. Cuenta No. 1 --> " + cuenta1.propietario);
                    System.out.println("2. Cuenta No. 2 --> " + cuenta2.propietario);
                    System.out.println("3. SALIR");
                    int elegirDeposito = info.nextInt();
                    switch (elegirDeposito) {
                        case 1:
                            System.out.println("Ingrese la cantidad a depositar: ");
                            double deposito1 = info.nextDouble();
                            cuenta1.incrementarSaldos(deposito1);
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad a depositar: ");
                            double deposito2 = info.nextDouble();
                            cuenta2.incrementarSaldos(deposito2);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n-----RETIRAR-----");
                    System.out.println("1. Cuenta No. 1 --> " + cuenta1.propietario);
                    System.out.println("2. Cuenta No. 2 --> " + cuenta2.propietario);
                    System.out.println("3. SALIR");
                    int elegirRetiro = info.nextInt();
                    switch (elegirRetiro) {
                        case 1:
                            System.out.println("Ingrese la cantidad a retirar: ");
                            double retiro1 = info.nextDouble();
                            cuenta1.decrementarSaldos(retiro1);
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad a retirar: ");
                            double retiro2 = info.nextDouble();
                            cuenta2.decrementarSaldos(retiro2);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n-----SALDOS-----");
                    cuenta1.mostrarSaldos();
                    cuenta2.mostrarSaldos();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
    }
}
