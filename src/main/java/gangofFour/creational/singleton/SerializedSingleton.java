package gangofFour.creational.singleton;

import java.io.Serializable;

/**
 * Created by nguyen on 10/7/2016.
 */
public class SerializedSingleton implements Serializable {

  private static final long serialVersionUID = -7604766932017737115L;

  private SerializedSingleton() {
  }

  public static SerializedSingleton getInstance() {
    return SingletonHelper.instance;
  }

  protected Object readResolve() {
    return getInstance();
  }

  private static class SingletonHelper {

    private static final SerializedSingleton instance = new SerializedSingleton();
  }
}

