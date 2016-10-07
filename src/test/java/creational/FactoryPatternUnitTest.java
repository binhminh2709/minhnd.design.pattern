package creational;

import creational.factory.pattern.Car;
import org.junit.Test;

import static creational.factory.pattern.CarFactory.createCar;
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
