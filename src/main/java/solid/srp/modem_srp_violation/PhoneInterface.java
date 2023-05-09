package solid.srp.modem_srp_violation;

public interface PhoneInterface {
    void dial(String phoneNamber);  //1
    void disconnect();              //2 - 1,2 Connection management

    void send(String message);  //3
    int receive();              //4 - 3,4 Data management

}







