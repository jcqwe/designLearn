package SimpleFactory.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepareOriginalPizza() {
        System.out.println("准备奶酪披萨的原材料");
    }


}
