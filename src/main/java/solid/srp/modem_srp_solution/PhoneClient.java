package solid.srp.modem_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        IConnection connection = new ConnectionManagerImplementation();
        IDataManager dataManager = new DataManagerImplementation();
        Phone phone = new Phone(connection, dataManager);
        phone.dial("666 777 666");
        phone.send("message");
        phone.receive();
        phone.disconnect();
    }
}
