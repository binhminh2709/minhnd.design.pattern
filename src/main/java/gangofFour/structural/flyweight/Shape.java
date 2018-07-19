package gangofFour.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by nguyen on 10/7/2016.
 */
public interface Shape {

  public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
