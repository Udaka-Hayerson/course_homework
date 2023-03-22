package oop_itvdn.eighth_lesson.price;

//Задание 3
//Создайте проект, используя IntelliJ IDEA.
//Требуется: Описать класс с именем Price, содержащую следующие поля:
// название товара;
// название магазина, в котором продается товар;
// стоимость товара в гривнах.
//Написать программу, выполняющую следующие действия:
// ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
//быть упорядочены в алфавитном порядке по названиям магазинов);

public class Price {

    private String name_of_shop;
    private String product_name;
    private String cost_of_goods_in_hryvnia;

    public Price(String name_of_shop, String product_name, String cost_of_goods_in_hryvnia) {
        this.name_of_shop = name_of_shop;
        this.product_name = product_name;
        this.cost_of_goods_in_hryvnia = cost_of_goods_in_hryvnia;
    }

    public String getName_of_shop() {
        return name_of_shop;
    }

    public void setName_of_shop(String name_of_shop) {
        this.name_of_shop = name_of_shop;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCost_of_goods_in_hryvnia() {
        return cost_of_goods_in_hryvnia;
    }

    public void setCost_of_goods_in_hryvnia(String cost_of_goods_in_hryvnia) {
        this.cost_of_goods_in_hryvnia = cost_of_goods_in_hryvnia;
    }
}
