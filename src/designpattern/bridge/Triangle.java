package designpattern.bridge;

/**
 * Created by hemants on 26/09/18.
 */
public class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
    }

    @Override
    void paintColor() {
        System.out.print("Triangle is painted with color ");
        color.applyColor();
    }
}
