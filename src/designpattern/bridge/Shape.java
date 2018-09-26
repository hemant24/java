package designpattern.bridge;

/**
 * Created by hemants on 26/09/18.
 */
public abstract class Shape {
    Color color;

    Shape(Color color){
        this.color = color;
    }

    abstract void paintColor();
}
