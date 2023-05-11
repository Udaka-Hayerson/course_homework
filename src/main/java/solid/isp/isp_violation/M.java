package solid.isp.isp_violation;

public class M {
    public static void main(String[] args) {
        I i = new I();
        A a = new A(i);
        B b = new B(i);
        System.out.println(a.callGetName());
        System.out.println(b.callGetDate());
    }
}
