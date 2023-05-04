package oop_itvdn.ninth_lesson.device_tostring;


public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        System.out.println("EthernetAdapter @Override toString()");
        return String.format("%s: manufacturer = %s, price= %f, serialNumber = %s, speed = %d, msc = %s" ,
                this.getClass().getName(), this.getManufacturer(), this.getPrice(), this.getSerialNumber(), this.getSpeed(), this.getMac());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
