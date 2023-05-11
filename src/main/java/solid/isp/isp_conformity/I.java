package solid.isp.isp_conformity;

import java.util.Date;
import java.util.List;

public class I implements I1, I2 {
    private Customer customer;
    private List<Product> productList;

    public I(Customer customer, List<Product> productList) {
        this.customer = customer;
        this.productList = productList;
    }

    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }
}
