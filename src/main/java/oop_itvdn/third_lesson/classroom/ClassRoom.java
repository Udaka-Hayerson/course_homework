package oop_itvdn.third_lesson.classroom;

//Создать класс, представляющий учебный класс ClassRoom.
//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcellentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//переопределите каждый из методов, в зависимости от успеваемости ученика.
//Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
//Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//отдыхать.

public class ClassRoom {

    Pupil pupil;
    ExcellentPupil excellentPupil;
    GoodPupil goodPupil;
    BadPupil badPupil;

    public ClassRoom(Pupil pupil, ExcellentPupil excellentPupil, GoodPupil goodPupil, BadPupil badPupil) {
        this.pupil = pupil;
        this.excellentPupil = excellentPupil;
        this.goodPupil = goodPupil;
        this.badPupil = badPupil;
    }

    public ClassRoom(Pupil pupil, ExcellentPupil excellentPupil, GoodPupil goodPupil) {
        this.pupil = pupil;
        this.excellentPupil = excellentPupil;
        this.goodPupil = goodPupil;
    }

    public ClassRoom(Pupil pupil, ExcellentPupil excellentPupil) {
        this.pupil = pupil;
        this.excellentPupil = excellentPupil;
    }

    public void classRoomInfo4(){
        pupil.info();
        excellentPupil.info();
        goodPupil.info();
        badPupil.info();
    }

    public void classRoomInfo3(){
        pupil.info();
        excellentPupil.info();
        goodPupil.info();
    }

    public void classRoomInfo2(){
        pupil.info();
        excellentPupil.info();;
    }
}
