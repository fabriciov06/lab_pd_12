package model;

public class LaptopGamer extends Laptop {
    public LaptopGamer(String marcaModelo,
                       int anioFabricacion,
                       String procesador,
                       double tamanioPantalla) {

        super("Laptop para Gamer",
                marcaModelo,
                anioFabricacion,
                procesador,
                tamanioPantalla);

    }

    @Override
    public void ejecutarPrueba() {

        System.out.println("Corriendo programas en una Laptop para Gamer");
    }

}
