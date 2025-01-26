package multilevelinheritance.onlineretailordermanagement;

 class ShippedOrder extends Order {
    int trackingNumber;

ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate); // Call the superclass constructor
        this.trackingNumber = trackingNumber;
    }

    @Override
 DeliveredOrder getOrderStatus(Order order) {

        System.out.println("ShippedOrder class - Order Status: " + order );

        return (DeliveredOrder) order; // Typecast to ShippedOrder
    }

//    @Override
//    public String toString() {
//
//        return "ShippedOrder{" +
//                "orderId=" + orderId +
//                ", orderDate='" + orderDate + '\'' +
//                ", trackingNumber=" + trackingNumber +
//                '}';
//    }
}
