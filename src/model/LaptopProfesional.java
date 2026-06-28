package model;

public class LaptopProfesional extends Laptop {
    public LaptopProfesional(String marcaModelo,
                             int anioFabricacion,
                             String procesador,
                             double tamanioPantalla) {

        super("Laptop para Profesional",
                marcaModelo,
                anioFabricacion,
                procesador,
                tamanioPantalla);

    }

    @Override
    public void ejecutarPrueba() {

        System.out.println("Corriendo programas en una Laptop Profesional");
    }
}
