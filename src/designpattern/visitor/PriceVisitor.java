package designpattern.visitor;

/**
 * Created by hemants on 26/09/18.
 */
public class PriceVisitor implements ItemVisitor {

    @Override
    public int visit(BookElement b) {
        return b.price;
    }

    @Override
    public int visit(FruitElement b) {
        return b.pricePerKg * b.weight;
    }
}
