package other.servicelocator;

/**
 * Created by nguye on 11/4/16.
 */
public class ServiceLocator {

  private static Cache cache;

  static {
    cache = new Cache();
  }

  public static Service getService(String jndiName) {
    Service cacheService = cache.getService(jndiName);
    if (cacheService != null) {
      return cacheService;
    }
    InitialContext context = new InitialContext();
    Service lookupService = (Service) context.lookup(jndiName);
    cache.addService(lookupService);
    return lookupService;
  }
}
