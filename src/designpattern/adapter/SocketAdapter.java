package designpattern.adapter;

/**
 * Created by hemants on 27/09/18.
 */
public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get40Volt();
    public Volt get12Volt();
}
