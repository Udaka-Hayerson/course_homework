package oop_itvdn.ninth_lesson.device;

public class DeviceTest{
    public static void main(String[] args) {

        Device device1 = new Device("Ukraine", 600.9f, "90876002");
        Device device2 = new Device("China", 200.9f, "00572244");

        Monitor monitor1 = new Monitor("Ukraine", 600.9f, "90876002", 2900, 1080);
        Monitor monitor2 = new Monitor("China", 200.9f, "00572244", 2900, 1080);

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Ukraine", 600.9f, "90876002", 300, "MAC-48: 00-08-74-4C-7F-1D");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("China", 200.9f, "00572244", 200, "MAC-48: 00-66-47-4C-7F-1D");

        System.out.println(device1 + "\n" + device2 + "\n" + monitor1 + "\n" + monitor2 + "\n" + ethernetAdapter1 + "\n" + ethernetAdapter2);
        System.out.println(device1.equals(device2));
        System.out.println(monitor1.equals(monitor2));
        System.out.println(ethernetAdapter1.equals(ethernetAdapter2));

    }
}