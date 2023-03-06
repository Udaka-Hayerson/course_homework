package oop_itvdn.firstlesson.address;

//    Используя IDEA, создайте проект c пакетом.
//    Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
//    street, house, apartment.
//    Для каждого поля, создать метод с двумя методами доступа (get, set)
//    Создать экземпляр класса Address.
//    В поля экземпляра записать информацию о почтовом адресе.
//    Выведите на экран значения полей, описывающих адрес.

public class Address {


    public String index;
    public String country;
    public String city;
    public String street;
    public int house;
    public int apartment;

    public Address(String index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void printAddress(String index, String country, String city, String street, int house, int apartment) {
        System.out.println("index: "+ index+", country: "+country+", city: "+city+", street: "+street+", house: "+house+", apartment: "+apartment);

    }
    public void printAddress(Object object) {
        System.out.println(object);
        System.out.println("index: "+ index+", country: "+country+", city: "+city+", street: "+street+", house: "+house+", apartment: "+apartment);
    }

}

