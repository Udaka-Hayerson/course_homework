package solid.isp.order_isp_conformity;

public interface OrderService {

    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);

}
