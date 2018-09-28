package designpattern.adapter;


/**
 * Created by hemants on 27/09/18.
 */
public class SocketAdapterImpl implements SocketAdapter {

    private SocketLib socket = new SocketLib();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get40Volt() {
        Volt volt = new Volt();
        volt.setValue(socket.getVolt().value/3);
        return volt;
    }

    @Override
    public Volt get12Volt() {
        Volt volt = new Volt();
        volt.setValue(socket.getVolt().value/10);
        return volt;
    }
}
