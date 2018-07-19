package gangofFour.behavioural.template.method;

/**
 * Created by Administrator on 10/1/2015.
 */
public class GlassHouse extends HouseTemplate {

  @Override
  public void buildWalls() {
    System.out.println("Building Glass Walls");
  }

  @Override
  public void buildPillars() {
    System.out.println("Building Pillars with glass coating");
  }
}
