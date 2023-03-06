package classchild;

public class ClassChild { //extends ClassParent {
    private int number;


    private ClassChild(){}

    private ClassChild(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    static public ClassChild pubSetClassChild() {
        return new ClassChild();
    }

    static public ClassChild pubSetClassChild(int num) {
        return new ClassChild(num);
    }

//    public ClassChild(int i) {
//        super(i);
//    }
}

