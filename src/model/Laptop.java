package model;

public abstract class Laptop {

    protected String marcaModelo;
    protected int anioFabricacion;
    protected String procesador;
    protected int tamanioPantalla;

    public Laptop(String marcaModelo, int anioFabricacion, String procesador, int tamanioPantalla) {
        this.marcaModelo = marcaModelo;
        this.anioFabricacion = anioFabricacion;
        this.procesador = procesador;
        this.tamanioPantalla = tamanioPantalla;
    }

    public void mostrarDatos() {
        System.out.println("Marca y Modelo: " + marcaModelo);
        System.out.println("Año de Fabricación: " + anioFabricacion);
        System.out.println("Procesador: " + procesador);
        System.out.println("Tamaño de la Pantalla: " + tamanioPantalla);
    }

    public abstract void ejecutarPrueba();
}