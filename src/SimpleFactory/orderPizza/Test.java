package SimpleFactory.orderPizza;

public class Test {
    public static void main(String[] args) {
//        new OrderPizza();
        new OrderPizza(new SimpleFactory());
    }
}
