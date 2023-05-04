package oop_itvdn.ninth_lesson.device_equals_hashcode;

//Задание 4
//Смотреть задание 2.
//Переопределить методы equals & hashCode в каждом классе.
//Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные
//методы.

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
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (manufacturer != device.manufacturer|| price != device.price || serialNumber != device.serialNumber) return false;
        else return true;
    }

    @Override
    public int hashCode(){
        System.out.print("hashCode: ");
        return super.hashCode();
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
