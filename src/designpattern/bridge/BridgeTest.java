package designpattern.bridge;

/**
 * Created by hemants on 26/09/18.
 */
public class BridgeTest {

    public static void main(String[] args) {
        RedColor redColor = new RedColor();
        BlueColor blueColor = new BlueColor();

        Shape shape1 = new Triangle(redColor);
        Shape shape2 = new Triangle(blueColor);

        Shape shape3 = new Square(redColor);

        shape1.paintColor();
    }
}
