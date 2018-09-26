package designpattern.visitor;

/**
 * Created by hemants on 26/09/18.
 */
public interface ItemElement {

    int accept(ItemVisitor visitor);

}
