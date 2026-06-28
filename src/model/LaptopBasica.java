package model;

public class LaptopBasica extends Laptop {

    public LaptopBasica(String marcaModelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        super(marcaModelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Básica");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Laptop Básica");
        super.mostrarDatos();
    }
}