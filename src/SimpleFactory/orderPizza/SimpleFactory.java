package SimpleFactory.orderPizza;

import SimpleFactory.pizza.BannerPizza;
import SimpleFactory.pizza.CheesePizza;
import SimpleFactory.pizza.GreekPizza;
import SimpleFactory.pizza.Pizza;

public class SimpleFactory {
    public Pizza getPizza(String pizzaType){
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setPizzaName("奶酪披萨");
        } else if (pizzaType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setPizzaName("希腊披萨");
        } else if(pizzaType.equals("banner")){
            pizza = new BannerPizza();
            pizza.setPizzaName("香蕉披萨");
        }
        return pizza;
    }
}
