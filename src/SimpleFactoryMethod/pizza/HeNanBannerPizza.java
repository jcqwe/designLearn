package SimpleFactoryMethod.pizza;

public class HeNanBannerPizza extends Pizza {
    @Override
    public void prepareOriginalPizza() {
        setPizzaName("河南香蕉披萨");
        System.out.println("准备河南香蕉披萨");
    }
}
