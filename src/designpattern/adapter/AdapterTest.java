package designpattern.adapter;

/**
 * Created by hemants on 28/09/18.
 */
public class AdapterTest {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();

        System.out.println(socketAdapter.get12Volt());

    }
}
