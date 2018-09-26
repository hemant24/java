package designpattern.visitor;

/**
 * Created by hemants on 26/09/18.
 */
public class WeightVisitor implements ItemVisitor{
    @Override
    public int visit(BookElement b) {
        return b.weight;
    }

    @Override
    public int visit(FruitElement b) {
        return b.weight;
    }
}
