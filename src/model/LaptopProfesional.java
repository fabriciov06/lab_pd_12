package model;

public class LaptopProfesional extends Laptop {

    public LaptopProfesional(String marcaModelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        super(marcaModelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Laptop Profesional");
        super.mostrarDatos();
    }
}