package SimpleFactory.pizza;

public class BannerPizza extends Pizza{
    @Override
    public void prepareOriginalPizza() {
        System.out.println("准备香蕉披萨");
    }
}
