package gangofFour.behavioural.visitor;

/**
 * Created by nguye on 11/13/16.
 */
public interface ShoppingCartVisitor {

  int visit(Book book);

  int visit(Fruit fruit);
}
