package solid.isp.isp_violation;

public class A {
    private I i;

    public A(I i) {
        this.i = i;
    }

    public String callGetName(){
        return i.getName();
    }
}
