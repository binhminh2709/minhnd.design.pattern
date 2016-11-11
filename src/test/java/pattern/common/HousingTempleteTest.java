package pattern.common;


import gangofFour.behavioural.template.method.GlassHouse;
import gangofFour.behavioural.template.method.HouseTemplate;
import gangofFour.behavioural.template.method.WoodenHouse;

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
