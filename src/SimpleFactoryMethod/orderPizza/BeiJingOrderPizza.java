package SimpleFactoryMethod.orderPizza;

import SimpleFactoryMethod.pizza.*;

public class BeiJingOrderPizza extends OrderPizza{

    @Override
    public Pizza cretePizza(String type) {
        Pizza pizza = null;
        if(type.equals("banner")){
            pizza = new BeiJingBannerPizza();
        }else if(type.equals("cheese")){
            pizza = new BeiJingCheesePizza();
        }
        return pizza;
    }
}
