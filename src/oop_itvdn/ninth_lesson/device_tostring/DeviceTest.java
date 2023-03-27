package oop_itvdn.ninth_lesson.device_tostring;

public class DeviceTest{

    public static void main(String[] args) {
        Device device3 = new Device("Ukraine", 600.9f, "90876002");
        Device device4 = new Device("China", 200.9f, "00572244");
        System.out.println(device3);
        System.out.println(device4);

        Monitor monitor3 = new Monitor("Ukraine", 600.9f, "90876002", 2900, 1080);
        Monitor monitor4 = new Monitor("China", 200.9f, "00572244", 2900, 1080);
        System.out.println(monitor3);
        System.out.println(monitor4);

        EthernetAdapter ethernetAdapter3 = new EthernetAdapter("Ukraine", 600.9f, "90876002", 300, "MAC-48: 00-08-74-4C-7F-1D");
        EthernetAdapter ethernetAdapter4 = new EthernetAdapter("China", 200.9f, "00572244", 200, "MAC-48: 00-66-47-4C-7F-1D");
        System.out.println(ethernetAdapter3);
        System.out.println(ethernetAdapter4);
    }
}
