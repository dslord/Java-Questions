package Exp6.Exercise;

interface DeliveryStatus {
    void updateStatus();
}

class FoodDelivery {
    int orderId;
    String customerName;
    String foodItem;

    FoodDelivery (int orderId, String customerName, String foodItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    class OrderDetails {
        void display() {
            System.out.println("Order ID      : " + orderId);
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + foodItem);
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        FoodDelivery order = new FoodDelivery(101, "Devansh", "Pizza");

        FoodDelivery.OrderDetails details = order.new OrderDetails();
        details.display();

        DeliveryStatus status = new DeliveryStatus() {
            @Override
            public void updateStatus() {
                System.out.println("Delivery Status : Out for Delivery");
            }
        };

        status.updateStatus();
    }
}