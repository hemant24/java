package designpattern.adapter;

/**
 * Created by hemants on 27/09/18.
 */
public class SocketLib {

    public Volt getVolt(){
        Volt v = new Volt();
        v.setValue(120);
        return v;
    }
}
