package factory;

import model.Laptop;
import model.LaptopBasica;

public class BasicFactory extends LaptopFactory {

    @Override
    public Laptop crearLaptop() {

        return new LaptopBasica(
                "HP 250 G10",
                2023,
                "Intel Core i5-1335U",
                15);

    }

}
