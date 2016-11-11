package creational;

import gangofFour.creational.abstractfactory.Computer;
import gangofFour.creational.abstractfactory.ComputerFactory;
import gangofFour.creational.abstractfactory.PCFactory;
import gangofFour.creational.abstractfactory.ServerFactory;

/**
 * Created by nguyen on 10/6/2016.
 */
public class AbstractFactoryPatternUnitTest {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
