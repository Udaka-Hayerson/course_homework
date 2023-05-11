package solid.isp.isp_conformity;

public class B {
    private I2 i2;

    public B(I2 i2) {
        this.i2 = i2;
    }

    public void callGetDate(){
        System.out.println(i2.getDate());
    }
}
