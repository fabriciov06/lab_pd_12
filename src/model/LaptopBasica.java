package model;

public class LaptopBasica extends Laptop {
    public LaptopBasica(String marcaModelo,
                        int anioFabricacion,
                        String procesador,
                        double tamanioPantalla) {

        super("Laptop Basica",
                marcaModelo,
                anioFabricacion,
                procesador,
                tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {

        System.out.println("Corriendo programas en una Laptop Basica");
    }

}
