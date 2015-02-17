package singleton;

public class Singleton {
    
    private static Singleton INSTANCE;
    
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    
    public void singletonMethod() {
        // operations here
    }
    
/**
 * A singleton is a class that allows only one instance to be created.
 * It is often used to create a single point of entry to a third party, such as a database or web service,
 * so that the number of connections can be easily managed and configured in one place.
 * Restricting clients of a singleton class to only one instance can prove challenging
 * */
}
