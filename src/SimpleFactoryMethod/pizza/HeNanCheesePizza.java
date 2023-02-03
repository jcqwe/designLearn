package SimpleFactoryMethod.pizza;

public class HeNanCheesePizza extends Pizza {
    @Override
    public void prepareOriginalPizza() {
        setPizzaName("河南奶酪披萨");
        System.out.println("准备河南奶酪披萨");
    }
}
