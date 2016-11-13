package gangofFour.structural.flyweight;

import java.awt.*;

/**
 * Created by nguye on 11/14/16.
 */
public class Line implements Shape {

    protected Line line;

    public Line() {
        System.out.println("Creating Line object"); //adding time delay
        line = new Line();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        line.setColor(color); line.drawLine(x1, y1, x2, y2);
    }
}
