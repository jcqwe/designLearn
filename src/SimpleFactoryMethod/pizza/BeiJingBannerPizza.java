package SimpleFactoryMethod.pizza;

public class BeiJingBannerPizza extends Pizza {
    @Override
    public void prepareOriginalPizza() {
        setPizzaName("北京香蕉披萨");
        System.out.println("准备北京香蕉披萨");
    }
}
