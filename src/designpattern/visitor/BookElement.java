package designpattern.visitor;

/**
 * Created by hemants on 26/09/18.
 */
public class BookElement implements ItemElement{

    int price;
    int weight;

    BookElement(int price, int weight){
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int accept(ItemVisitor visitor) {
        return visitor.visit(this);
    }
}
