package creational;

import gangofFour.creational.factory.Car;
import org.junit.Test;

import static gangofFour.creational.factory.CarFactory.createCar;
import static junit.framework.TestCase.assertNull;

/**
 * Created by nguyen on 10/6/2016.
 */
public class FactoryPatternUnitTest {

    @Test
    public void testCreateCar() {
        Car c = createCar("minhnd");
        assertNull(c);
    }
}
