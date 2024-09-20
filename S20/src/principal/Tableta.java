/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
public class Tableta extends ProductoElectronico {

    // Atributos
    private double tamanoPantalla;
    private String resolucionPantalla;

    // Constructores
    public Tableta() {
    }

    public Tableta(double tamanoPantalla, String resolucionPantalla, double precio, String marca, String modelo) {
        super(precio, marca, modelo);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucionPantalla = resolucionPantalla;
    }

    // Getters y Setters
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    @Override
    public String toString() {
        return "Tableta {" + " tamanoPantalla = " + tamanoPantalla + ", resolucionPantalla = " + resolucionPantalla + super.toString() + "}";
    }

}
