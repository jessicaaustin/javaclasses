package homework.grubhub;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private List<OrderItem> items = new ArrayList<OrderItem>();
    private boolean delivery;

    public Order(Restaurant restaurant, boolean delivery) {
        this.restaurant = restaurant;
        this.delivery = delivery;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getPrice();
        }

        // tax is calculated based off of subtotal
        double tax = 0.08 * total;
        total += tax;

        if (delivery) {
            double deliveryFee = restaurant.getDeliveryFee();
            total += deliveryFee;
        }

        return total;
    }
}