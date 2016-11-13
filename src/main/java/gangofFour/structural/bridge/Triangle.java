package gangofFour.structural.bridge;

/**
 * Created by nguye on 11/14/16.
 */
public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color");
        color.applyColor();
    }
}
