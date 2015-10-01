package pattern.common;


import templateMethod.GlassHouse;
import templateMethod.HouseTemplate;
import templateMethod.WoodenHouse;

/**
 * Created by Administrator on 10/1/2015.
 */
public class HousingTempleteTest {
    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
