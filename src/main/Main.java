package main;

import factory.LaptopFactory;
import model.Laptop;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS");
        System.out.println("--------------------------------------");

        LaptopFactory factory = new LaptopFactory();

        Laptop gamer = factory.crearLaptop(
                "gamer",
                "MSI Katana 17",
                2024,
                "AMD Ryzen 9 8945HS",
                17);

        Laptop basica = factory.crearLaptop(
                "basica",
                "Acer Aspire 5",
                2022,
                "Intel Core i3-1215U",
                15);

        Laptop profesional = factory.crearLaptop(
                "profesional",
                "Dell XPS 15",
                2024,
                "Intel Core Ultra 9",
                15);

        gamer.ejecutarPrueba();
        System.out.println();
        gamer.mostrarDatos();

        System.out.println();

        basica.ejecutarPrueba();
        System.out.println();
        basica.mostrarDatos();

        System.out.println();

        profesional.ejecutarPrueba();
        System.out.println();
        profesional.mostrarDatos();

    }

}
