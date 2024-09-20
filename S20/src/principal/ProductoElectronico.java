/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
public class ProductoElectronico {

    // Atributos
    private double precio;
    private String marca;
    private String modelo;

    // Constructor
    public ProductoElectronico() {
    }

    public ProductoElectronico(double precio, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return ", ProductoElectronico {" + " precio = " + precio + ", marca = " + marca + ", modelo = " + modelo + '}';
    }

}
