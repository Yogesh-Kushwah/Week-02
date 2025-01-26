package multilevelinheritance.onlineretailordermanagement;

public class ControlClass {
    public static void main(String[] args) {
        // Create an instance of DeliveredOrder
        Order delivery = new DeliveredOrder(123, "12/1/24", 568432, "15/2/25");

        // Call the overridden getOrderStatus() method
//       Order order =  delivery.getOrderStatus(delivery);

        DeliveredOrder orderStatus = delivery.getOrderStatus(delivery);

        System.out.println("Order id:: " + orderStatus.orderId);
        System.out.println( "OrderDAte " + orderStatus.orderDate);

        System.out.println("Traking Number : " + orderStatus.trackingNumber);
        System.out.println( "Delivery Date " + orderStatus.deliveryDate);



    }
}
