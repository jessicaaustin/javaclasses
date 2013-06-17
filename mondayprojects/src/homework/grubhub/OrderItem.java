package homework.grubhub;

public class OrderItem {
    private String name;
    private double price;

    public OrderItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "  --  $" + price;
    }

    public double getPrice() {
        return price;
    }
}
