package solid.srp.modem_srp_solution;

public class Phone implements IConnection, IDataManager{
    private IConnection connection;
    private IDataManager dataChannel;

    public Phone(IConnection connection, IDataManager dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNamber) {
        connection.dial(phoneNamber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataChannel.send(message);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
