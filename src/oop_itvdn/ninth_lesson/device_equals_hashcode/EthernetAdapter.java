package oop_itvdn.ninth_lesson.device_equals_hashcode;


public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter device = (EthernetAdapter) obj;
        if (!super.equals(obj) || speed != device.speed|| mac != device.mac) return false;
        else return true;
    }

    @Override
    public int hashCode(){
        System.out.print("");
        return super.hashCode();
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
