package solid.srp.modem_srp_solution;

public class ConnectionManagerImplementation implements IConnection{
    @Override
    public void dial(String phoneNamber) {
        System.out.println("connected established with: " + phoneNamber);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }
}
