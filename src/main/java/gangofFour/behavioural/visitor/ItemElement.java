package gangofFour.behavioural.visitor;

/**
 * Created by nguyen on 10/7/2016.
 */
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);

}
