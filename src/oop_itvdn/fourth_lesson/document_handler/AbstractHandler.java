package oop_itvdn.fourth_lesson.document_handler;

//Задание 2
//Используя IntelliJ IDEA, создайте проект.Требуется:
//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save().
//Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//Написать программу, которая будет выполнять определение документа и для каждого формата должны
//быть методы открытия, создания, редактирования, сохранения определенного формата документа.

import java.io.FileWriter;

abstract class AbstractHandler {

    abstract void open();

    abstract void create() throws Exception;

    abstract void change() throws Exception;

    abstract void save() throws Exception;
}
