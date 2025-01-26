package multilevelinheritance.onlineretailordermanagement;

 class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call the parent constructor
        this.deliveryDate = deliveryDate;
    }

    @Override
 DeliveredOrder getOrderStatus(Order order) {
        System.out.println("DeliveredOrder class - Order Status: " + order);

        // Call the parent class's getOrderStatus() method
        super.getOrderStatus(order);

        return (DeliveredOrder) order; // Typecast to DeliveredOrder
    }

//    @Override
//    public String toString() {
//
//        return "DeliveredOrder{" +
//                "orderId=" + orderId +
//                ", orderDate='" + orderDate + '\'' +
//                ", trackingNumber=" + trackingNumber +
//                ", deliveryDate='" + deliveryDate + '\'' +
//                '}';
//
//    }
}
