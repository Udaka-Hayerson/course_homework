package oop_itvdn.ninth_lesson.device_equals_hashcode;

public class DeviceTest{
    public static void main(String[] args) {

        Device device5 = new Device("Ukraine", 600.9f, "90876002");
        Device device6 = new Device("China", 200.9f, "00572244");
        System.out.println(device5.hashCode());
        System.out.println(device6.hashCode());
        System.out.println(device5.equals(device6));

        Monitor monitor5 = new Monitor("Ukraine", 600.9f, "90876002", 2900, 1080);
        Monitor monitor6 = new Monitor("China", 200.9f, "00572244", 2900, 1080);
        System.out.println(monitor5.hashCode());
        System.out.println(monitor6.hashCode());
        System.out.println(monitor5.equals(monitor6));

        EthernetAdapter ethernetAdapter5 = new EthernetAdapter("Ukraine", 600.9f, "90876002", 300, "MAC-48: 00-08-74-4C-7F-1D");
        EthernetAdapter ethernetAdapter6 = new EthernetAdapter("China", 200.9f, "00572244", 200, "MAC-48: 00-66-47-4C-7F-1D");
        System.out.println(ethernetAdapter5.hashCode());
        System.out.println(ethernetAdapter6.hashCode());
        System.out.println(ethernetAdapter5.equals(ethernetAdapter6));
    }
}
