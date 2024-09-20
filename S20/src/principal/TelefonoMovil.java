/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
public class TelefonoMovil extends ProductoElectronico {

    // Atributos
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    // Constructores
    public TelefonoMovil() {
    }

    public TelefonoMovil(int capacidadAlmacenamiento, int duracionBateria, double precio, String marca, String modelo) {
        super(precio, marca, modelo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }

    // Getters y Setters
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public String toString() {
        return "TelefonoMovil {" + "capacidadAlmacenamiento = " + capacidadAlmacenamiento + ", duracionBateria = " + duracionBateria  + super.toString() + "}";
    }

}
