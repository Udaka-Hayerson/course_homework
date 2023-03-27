package oop_itvdn.ninth_lesson.device_tostring;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        System.out.println("Monitor @Override toString()");
        return String.format("%s: manufacturer = %s, price= %f, serialNumber = %s , X = %d , Y = %d" ,
                this.getClass().getName(), this.getManufacturer(), this.getPrice(), this.getSerialNumber(), this.getResolutionX(), this.getResolutionY());
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
}
