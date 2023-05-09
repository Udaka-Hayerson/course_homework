package solid.srp.modem_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        PhoneInterface phone = new Phone();
        phone.dial("666 777 666");
        phone.send("message");
        phone.receive();
        phone.disconnect();

    }
}
