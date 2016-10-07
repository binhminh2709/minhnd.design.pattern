package creational.singleton.pattern;

/**
 * Created by nguyen on 10/7/2016.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    /**
     *  Reflection
     * */
    protected Object readResolve() {
        return getInstance();
    }
}
