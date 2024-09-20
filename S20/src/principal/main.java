/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chevi
 */
public class main {

    public static void main(String[] args) {
        // Instancias
        TelefonoMovil telefono = new TelefonoMovil();
        Tableta tableta = new Tableta();

        // Asignar valores
        telefono.setMarca("Xiaomi");
        telefono.setModelo("Redmi 12");
        telefono.setPrecio(2500.00);
        telefono.setDuracionBateria(100);
        telefono.setCapacidadAlmacenamiento(512);

        tableta.setMarca("Samsung");
        tableta.setModelo("Galaxy Note");
        tableta.setPrecio(3200.00);
        tableta.setResolucionPantalla("4K");
        tableta.setTamanoPantalla(14.5);

        // Mostrar valores
        System.out.println(telefono);
        System.out.println(tableta);

    }
}
