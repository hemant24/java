package designpattern.visitor;

/**
 * Created by hemants on 26/09/18.
 */
public interface ItemVisitor {

    int visit(BookElement b);
    int visit(FruitElement b);
}
