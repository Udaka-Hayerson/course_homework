package oop_itvdn.ninth_lesson.device_tostring;

//Задание 3
//Смотреть задание 2.
//В обоих классах переопределить метод toString, что бы вывод был следующим:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024


public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        System.out.println("Device @Override toString()");
        return String.format("%s: manufacturer = %s, price= %f, serialNumber = %s" ,
                this.getClass().getName(), this.getManufacturer(), this.getPrice(), this.getSerialNumber());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
