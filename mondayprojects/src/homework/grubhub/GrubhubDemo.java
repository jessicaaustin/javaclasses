package homework.grubhub;

public class GrubhubDemo {

    private static final OrderApi orderApi = new OrderApi();

    private static void homeworkProblemOneA() {

        // Create our test orders

        Restaurant restaurant = new Restaurant(2.99);

        Order eggFooYoungOrder = new Order(restaurant, true);
        eggFooYoungOrder.addItem(new OrderItem("Egg Foo Young", 5.99));

        Order kungPaoChickenOrder = new Order(restaurant, true);
        kungPaoChickenOrder.addItem(new OrderItem("Kung Pao Chicken", 8.75));

        // save the orders

        int eggFooYoungOrderId = orderApi.submitOrder(eggFooYoungOrder);
        int kungPaoChickenOrderId = orderApi.submitOrder(kungPaoChickenOrder);

        // retrieve the orders

        Order retrievedEggFooYoungOrder = orderApi.retrieveOrder(eggFooYoungOrderId);
        Order retrievedKungPaoChickenOrder = orderApi.retrieveOrder(kungPaoChickenOrderId);

        // verification

        System.out.println("Verify we retrieved the original orders: ");
        System.out.println("Egg Foo Young order: " + eggFooYoungOrder.getTotal() + " == " + retrievedEggFooYoungOrder.getTotal());
        System.out.println("Kung Pao Chicken order: " + kungPaoChickenOrder.getTotal() + " == " + retrievedKungPaoChickenOrder.getTotal());
    }

    private static void homeworkProblemOneB() {
        // Create our test orders

        Restaurant restaurant = new Restaurant(2.99);

        Order eggFooYoungOrder = new Order(restaurant, true);
        eggFooYoungOrder.addItem(new OrderItem("Egg Foo Young", 5.99));
        orderApi.submitOrder(eggFooYoungOrder);

        Order kungPaoChickenOrder = new Order(restaurant, true);
        kungPaoChickenOrder.addItem(new OrderItem("Kung Pao Chicken", 8.75));
        orderApi.submitOrder(kungPaoChickenOrder);

        Order potstickersOrder = new Order(restaurant, false);
        potstickersOrder.addItem(new OrderItem("Potstickers", 1.75));
        potstickersOrder.addItem(new OrderItem("Potstickers", 1.75));
        potstickersOrder.addItem(new OrderItem("Potstickers", 1.75));
        orderApi.submitOrder(potstickersOrder);

        double revenue = orderApi.calculateRevenue();

        System.out.println("Verify we calculate revenue correctly: ");
        System.out.println("$2.76" + "  ==  $" + revenue);
    }

    public static void main(String[] args) {
        System.out.println("1.A):");
        homeworkProblemOneA();
        System.out.println("\n\n\n1.B):");
        homeworkProblemOneB();
    }
}
