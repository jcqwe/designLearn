package SimpleFactoryMethod.pizza;

public class BeiJingCheesePizza extends Pizza {
    @Override
    public void prepareOriginalPizza() {
        setPizzaName("北京奶酪披萨");
        System.out.println("准备北京奶酪披萨");
    }
}
