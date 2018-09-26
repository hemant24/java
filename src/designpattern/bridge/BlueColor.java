package designpattern.bridge;

/**
 * Created by hemants on 26/09/18.
 */
public class BlueColor implements Color{
    @Override
    public void applyColor() {
        System.out.print(" blue ");
    }
}
