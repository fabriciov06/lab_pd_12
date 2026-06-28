package factory;
import model.Laptop;
import model.LaptopBasica;
import model.LaptopGamer;
import model.LaptopProfesional;

public class LaptopFactory {
    public Laptop crearLaptop(String tipo,
                              String marcaModelo,
                              int anioFabricacion,
                              String procesador,
                              double tamanioPantalla) {

        switch (tipo.toLowerCase()) {

            case "gamer":

                return new LaptopGamer(
                        marcaModelo,
                        anioFabricacion,
                        procesador,
                        tamanioPantalla);

            case "basica":

                return new LaptopBasica(
                        marcaModelo,
                        anioFabricacion,
                        procesador,
                        tamanioPantalla);

            case "profesional":

                return new LaptopProfesional(
                        marcaModelo,
                        anioFabricacion,
                        procesador,
                        tamanioPantalla);

            default:

                throw new IllegalArgumentException("Tipo de laptop no válido.");

        }

    }
}
