package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hemants on 26/09/18.
 */
public class Main {
    public static void main(String[] args) {
        List<ItemElement> shopingCart = new ArrayList<ItemElement>();

        shopingCart.add(new BookElement(200, 1));
        shopingCart.add(new FruitElement(20, 2));

        int totalPrice = calculatePrice(shopingCart);
        int totalWeight = calculateWeight(shopingCart);

        System.out.println("Total price of cart is " + totalPrice);
        System.out.println("Total weight of cart is " + totalWeight);

    }

    private static int calculatePrice(List<ItemElement> shopingCart){
        int totalPrice = 0 ;
        PriceVisitor priceVisitor = new PriceVisitor();
        for(ItemElement ie : shopingCart){
            totalPrice += ie.accept(priceVisitor);
        }
        return totalPrice;
    }

    private static int calculateWeight(List<ItemElement> shopingCart){
        int totalWeigth = 0 ;
        WeightVisitor weightVisitor = new WeightVisitor();
        for(ItemElement ie : shopingCart){
            totalWeigth += ie.accept(weightVisitor);
        }
        return totalWeigth;
    }
}
