package SimpleFactoryMethod.orderPizza;

import SimpleFactoryMethod.pizza.HeNanBannerPizza;
import SimpleFactoryMethod.pizza.HeNanCheesePizza;
import SimpleFactoryMethod.pizza.Pizza;

public class HeNanOrderPizza extends OrderPizza{

    @Override
    public Pizza cretePizza(String type) {
        Pizza pizza = null;
        if(type.equals("banner")){
            pizza = new HeNanBannerPizza();
        }else if(type.equals("cheese")){
            pizza = new HeNanCheesePizza();
        }
        return pizza;
    }
}
