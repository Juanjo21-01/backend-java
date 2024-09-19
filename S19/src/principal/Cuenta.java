/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
public class Cuenta {

    // Atributos
    String propietario;
    double saldo;

    // Constructor
    public Cuenta() {
    }

    public Cuenta(String propietario, double saldo) {
        this.propietario = propietario;
        this.saldo = saldo;
    }

    // Metodos
    // Incrementar saldos
    public double incrementarSaldos(double saldo) {
        return this.saldo += saldo;
    }

    // Decrementar saldos
    public double decrementarSaldos(double saldo) {
        return this.saldo -= saldo;
    }

    // Mostrar saldos
    public void mostrarSaldos() {
        System.out.println("Propietario: " + this.propietario);
        System.out.println("Saldo de la Cuenta: " + this.saldo);
        System.out.println("");
    }
}
