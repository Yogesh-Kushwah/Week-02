package multilevelinheritance.onlineretailordermanagement;

public class Order {
    int orderId;
    String orderDate;

  Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }




  DeliveredOrder getOrderStatus(Order order) {
        System.out.println("Order class - Order Status: " + order);
        return (DeliveredOrder)order;
    }

//    @Override
//    public String toString() {
//        return "Order{" +
//                "orderId=" + orderId +
//                ", orderDate='" + orderDate + '\'' +
//                '}';
//    }
}
