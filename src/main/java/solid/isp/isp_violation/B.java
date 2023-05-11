package solid.isp.isp_violation;

import java.util.Date;

public class B {
    private I i;

    public B(I i) {
        this.i = i;
    }

    public Date callGetDate(){
        return i.getDate();
    }
}
