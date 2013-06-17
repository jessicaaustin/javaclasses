package equality;

public class Demo {

    public static void main(String[] args) {

        OrderItem eggFooYoung = new OrderItem("Egg Foo Young", 5.99);
        OrderItem potstickers = new OrderItem("Potstickers", 1.75);
        OrderItem anotherPotstickers = new OrderItem("Potstickers", 1.75);
        OrderItem cheaperPotstickers = new OrderItem("Potstickers", 1.25);

        System.out.println("true  == " + (eggFooYoung.equals(eggFooYoung)));

        System.out.println("false == " + (eggFooYoung.equals(potstickers)));

        System.out.println("true  == " + (potstickers.equals(anotherPotstickers)));
        System.out.println("true  == " + (anotherPotstickers.equals(potstickers)));
        System.out.println("false == " + (potstickers.equals(cheaperPotstickers)));

        System.out.println("false == " + (potstickers.equals("Potstickers")));
        System.out.println("false == " + (potstickers.equals(null)));

    }
}
