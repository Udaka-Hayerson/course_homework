package oop_itvdn.thirdlesson.classroom;

public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        ExcellentPupil excellentPupil = new ExcellentPupil();
        GoodPupil goodPupil = new GoodPupil();
        BadPupil badPupil = new BadPupil();
        ClassRoom classRoom = new ClassRoom(pupil, excellentPupil, goodPupil, badPupil);
        ClassRoom classRoomTwo = new ClassRoom(pupil, excellentPupil, goodPupil);
        ClassRoom classRoomThree = new ClassRoom(pupil, excellentPupil);


        System.out.println(classRoom);
        classRoom.pupil.study();
        classRoom.pupil.read();
        classRoom.pupil.write();
        classRoom.pupil.relax();

        classRoom.excellentPupil.study();
        classRoom.excellentPupil.read();
        classRoom.excellentPupil.write();
        classRoom.excellentPupil.relax();

        classRoom.goodPupil.study();
        classRoom.goodPupil.read();
        classRoom.goodPupil.write();
        classRoom.goodPupil.relax();

        classRoom.badPupil.study();
        classRoom.badPupil.read();
        classRoom.badPupil.write();
        classRoom.badPupil.relax();


        System.out.println(classRoomTwo);
        classRoomTwo.pupil.study();
        classRoomTwo.pupil.read();
        classRoomTwo.pupil.write();
        classRoomTwo.pupil.relax();

        classRoomTwo.excellentPupil.study();
        classRoomTwo.excellentPupil.read();
        classRoomTwo.excellentPupil.write();
        classRoomTwo.excellentPupil.relax();

        classRoomTwo.goodPupil.study();
        classRoomTwo.goodPupil.read();
        classRoomTwo.goodPupil.write();
        classRoomTwo.goodPupil.relax();


        System.out.println(classRoomThree);
        classRoomThree.pupil.study();
        classRoomThree.pupil.read();
        classRoomThree.pupil.write();
        classRoomThree.pupil.relax();

        classRoomThree.excellentPupil.study();
        classRoomThree.excellentPupil.read();
        classRoomThree.excellentPupil.write();
        classRoomThree.excellentPupil.relax();


        // 2 variant

        System.out.println(classRoom);
        classRoom.pupil.info();
        classRoom.excellentPupil.info();
        classRoom.goodPupil.info();
        classRoom.badPupil.info();

        System.out.println(classRoomTwo);
        classRoomTwo.pupil.info();
        classRoomTwo.excellentPupil.info();
        classRoomTwo.goodPupil.info();

        System.out.println(classRoomThree);
        classRoomThree.pupil.info();
        classRoomThree.excellentPupil.info();


        // 2 variant

        System.out.println(classRoom);
        classRoom.classRoomInfo4();

        System.out.println(classRoomTwo);
        classRoomTwo.classRoomInfo3();

        System.out.println(classRoomThree);
        classRoomThree.classRoomInfo2();

    }
}
