package oop_itvdn.firstlesson.address;
;

public class Main {


    public static void main(String[] args) {
        Address address = new Address("00019","Ukraine","Kyiv","Entuziastiv",11,48);
        address.printAddress(address.index, address.country, address.city, address.street, address.house, address.apartment);
        address.printAddress(address);
    }

}
