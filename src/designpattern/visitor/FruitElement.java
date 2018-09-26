package designpattern.visitor;

/**
 * Created by hemants on 26/09/18.
 */
public class FruitElement implements ItemElement{
    int pricePerKg;
    int weight;

    FruitElement(int pricePerKg, int weight){
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    @Override
    public int accept(ItemVisitor visitor) {
        return visitor.visit(this);
    }
}
