package creational;

import gangofFour.creational.factorymethod.ICar;
import org.junit.Test;

import static gangofFour.creational.factorymethod.CarFactory.createCar;
import static junit.framework.TestCase.assertNull;

/**
 * Created by nguyen on 10/6/2016.
 */
public class FactoryPatternUnitTest {

    @Test
    public void testCreateCar() {
        ICar c = createCar("minhnd");
        assertNull(c);
    }
}
