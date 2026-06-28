package main;

import factory.BasicFactory;
import factory.GamerFactory;
import factory.LaptopFactory;
import factory.ProfesionalFactory;
import model.Laptop;

public class Main {

    public static void main(String[] args) {

        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS");
        System.out.println();

        // Laptop Gamer
        LaptopFactory gamerFactory = new GamerFactory();
        Laptop gamer = gamerFactory.crearLaptop();

        gamer.ejecutarPrueba();
        gamer.mostrarDatos();

        System.out.println();

        // Laptop Básica
        LaptopFactory basicFactory = new BasicFactory();
        Laptop basica = basicFactory.crearLaptop();

        basica.ejecutarPrueba();
        basica.mostrarDatos();

        System.out.println();

        // Laptop Profesional
        LaptopFactory profesionalFactory = new ProfesionalFactory();
        Laptop profesional = profesionalFactory.crearLaptop();

        profesional.ejecutarPrueba();
        profesional.mostrarDatos();

    }
}