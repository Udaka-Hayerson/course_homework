package solid.srp.modem_srp_violation;

public class Phone implements PhoneInterface{
    @Override
    public void dial(String phoneNamber) {
        System.out.println("connected established with: " + phoneNamber);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");

    }

    @Override
    public void send(String message) {
        System.out.println("data sent successfully. your message: " + message);
    }

    @Override
    public int receive() {
        System.out.println("data received successfully");
        return 0;
    }
}
