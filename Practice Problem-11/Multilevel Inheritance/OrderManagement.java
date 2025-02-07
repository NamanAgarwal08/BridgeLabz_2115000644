class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed.";
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(1001, "01-02-2025");
        order.displayOrderDetails();
        System.out.println();

        ShippedOrder shippedOrder = new ShippedOrder(1002, "02-02-2025", "T1");
        shippedOrder.displayOrderDetails();
        System.out.println();

        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "03-03-2025", "T2", "04-02-2025");
        deliveredOrder.displayOrderDetails();
    }
}
