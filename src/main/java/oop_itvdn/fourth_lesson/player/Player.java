package oop_itvdn.fourth_lesson.player;


//Задание 3
//Используя IntelliJ IDEA, создайте проект.Требуется:
//Создайте 2 интерфейса Playable и Recordable. В каждом из интерфейсов создайте по 3 метода void play() /
//void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//Написать программу, которая выполняет проигрывание и запись.


//Задание 4
//Зайдите на сайт Oracle.
//Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру,
//который был рассмотрен на уроке, так, как это представлено ниже, в разделе «Рекомендуемые ресурсы»,
//описания данного урока. Сохраните ссылки и дайте им короткое описание.
//Абстрактные классы abstract
//https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
//Интерфейсы
//http://msdn.microsoft.com/ru-ru/library/ms173156.aspx


import javax.sound.sampled.*;

public class Player implements Playable , Recordable {

//    public static final Port.Info MICROPHONE = Mixer.getSourceLineInfo(); // new Port.Info(lineClass, name, isSource);
//    public static final Port.Info SPEAKER =  Mixer. getTargetLineInfo(); // new Port.Info();

    @Override
    public void play(){
        System.out.println("g");
    }

    @Override
    public void pause(){
        System.out.println("g");
    }

    @Override
    public void stop(){
        System.out.println("g");
    }

    @Override
    public void record(){
        System.out.println("g");
    }

//    void pause(){
//        System.out.println("g");
//    }
//
//    void stop(){
//        System.out.println("g");
//    }

}

