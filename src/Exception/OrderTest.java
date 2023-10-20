package Exception;

public class OrderTest {

    public void orderPlaced(int orderId) throws OrderNotFoundException {
        if(orderId == 88888) {
            throw new OrderNotFoundException("Order Id is not found "+orderId);
        } else {
            System.out.println("OrderId is found");
        }
    }

    public static void main(String[] args) {
        OrderTest orderTest = new OrderTest();
        orderTest.orderPlaced(787776);
    }
}
