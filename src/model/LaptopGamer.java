package model;

public class LaptopGamer extends Laptop {

    public LaptopGamer(String marcaModelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        super(marcaModelo, anioFabricacion, procesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Laptop para Gamer");
        super.mostrarDatos();
    }
}