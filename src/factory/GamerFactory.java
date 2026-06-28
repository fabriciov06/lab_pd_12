package factory;

import model.Laptop;
import model.LaptopGamer;

public class GamerFactory extends LaptopFactory {

    @Override
    public Laptop crearLaptop() {

        return new LaptopGamer(
                "ASUS ROG Strix G16",
                2024,
                "Intel Core i9-14900HX",
                16);

    }

}