package model;

public abstract class Laptop {

    protected String nombreLaptop;
    protected String marcaModelo;
    protected int anioFabricacion;
    protected String procesador;
    protected double tamanioPantalla;

    public Laptop(String nombreLaptop, String marcaModelo,
                  int anioFabricacion,
                  String procesador,
                  double tamanioPantalla) {

        this.nombreLaptop = nombreLaptop;
        this.marcaModelo = marcaModelo;
        this.anioFabricacion = anioFabricacion;
        this.procesador = procesador;
        this.tamanioPantalla = tamanioPantalla;
    }

    public void mostrarDatos() {

        System.out.println(nombreLaptop);
        System.out.println("Marca y Modelo: " + marcaModelo);
        System.out.println("Año de Fabricación: " + anioFabricacion);
        System.out.println("Procesador: " + procesador);
        System.out.println("Tamaño de la Pantalla: " + tamanioPantalla);
    }

    public abstract void ejecutarPrueba();

}