package oop_itvdn.eighth_lesson.price;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
    private int cost_of_goods_in_hryvnia;
    private final int[] alphabet_name_of_shop_index;
    static ArrayList<Price> shops = new ArrayList<>();;
    static final char[] ARR_EN = new char[]{'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public Price(String name_of_shop, String product_name, int cost_of_goods_in_hryvnia) {
        this.name_of_shop = name_of_shop;
        this.product_name = product_name;
        this.cost_of_goods_in_hryvnia = cost_of_goods_in_hryvnia;
        this.alphabet_name_of_shop_index = generateAlphabetNameIndex(name_of_shop);
        staticArrayWorkers(this);
    }

    private int[] generateAlphabetNameIndex(String name) {
        name = (name.replace(" ", "")).replace(".", "");
        int [] index = new int[ARR_EN.length];
        for (int i = 0; i < name.toCharArray().length; i++){  //char i: s.toCharArray()) {
            for(int j = 0; j < ARR_EN.length; j++) {
                if(String.valueOf(name.toCharArray()[i]).equalsIgnoreCase(String.valueOf(ARR_EN[j]))) {
                    index[i] = j;
                }
            }
        }
        return index;
    }


    private static void staticArrayWorkers(Price shop) {
        // algorithm
        shops.add(shop);
        if(shops.size() > 1){
            for (int i = 0; i < shops.size(); i++) {
                if (i == shops.size() - 1)
                    break;
                for (int j = 0; j < shops.get(i).alphabet_name_of_shop_index.length; j++) {
                    if(shops.get(i).alphabet_name_of_shop_index[j] > shops.get(i + 1).alphabet_name_of_shop_index[j]) {
                        Price sh = shops.get(i);
                        shops.set(i, shops.get(i + 1));
                        shops.set(i + 1, sh);
                        break;
                    } else if(shops.get(i).alphabet_name_of_shop_index[j] < shops.get(i + 1).alphabet_name_of_shop_index[j]) {
                        break;
                    }
                }
            }
        }
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

    public int getCost_of_goods_in_hryvnia() {
        return cost_of_goods_in_hryvnia;
    }

    public void setCost_of_goods_in_hryvnia(int cost_of_goods_in_hryvnia) {
        this.cost_of_goods_in_hryvnia = cost_of_goods_in_hryvnia;
    }


    public int[] getAlphabet_name_of_shop_index() {
        return alphabet_name_of_shop_index;
    }


}

class TestPrice{
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Price price_n = new Price(reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()));
        Price price_m = new Price(reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()));
        Price price_0 = new Price("ball shop", "ball", 666);
        Price price_1 = new Price("sex shop", "flowers", 111);
        Price price_2 = new Price("food shop", "meal", 333);
        Price price_3 = new Price("shoes shop", "shoe", 3333);
        Price price_4 = new Price("window shop", "window", 2222);

        for (Price p: Price.shops) {
            System.out.println(p.getName_of_shop() + " " + p.getProduct_name() + " " + p.getCost_of_goods_in_hryvnia());
            for (int i: p.getAlphabet_name_of_shop_index()){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
