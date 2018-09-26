package designpattern.bridge;

/**
 * Created by hemants on 26/09/18.
 */
public class Square extends Shape {

    Square(Color color) {
        super(color);
    }

    @Override
    void paintColor() {
        System.out.print("Square is painted with color ");
        color.applyColor();
    }
}
