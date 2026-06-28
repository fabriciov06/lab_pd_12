package factory;

import model.Laptop;
import model.LaptopProfesional;

public class ProfesionalFactory extends LaptopFactory {

    @Override
    public Laptop crearLaptop() {

        return new LaptopProfesional(
                "Lenovo ThinkPad X1 Carbon",
                2025,
                "Intel Core Ultra 7",
                14);

    }

}