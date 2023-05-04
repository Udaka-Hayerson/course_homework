package oop_itvdn.ninth_lesson.device;

//Задание 2
//Создать классы:
//1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
//Добавить методы доступа. Конструктор.


public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
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


