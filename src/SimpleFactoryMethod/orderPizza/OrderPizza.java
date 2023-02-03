package SimpleFactoryMethod.orderPizza;

import SimpleFactoryMethod.pizza.Pizza;

import java.util.Scanner;

public abstract class OrderPizza {
    public abstract Pizza cretePizza(String type);

    public OrderPizza() {
        Pizza pizza = null;
        do {
            pizza = cretePizza(getPizzaType());
            if (pizza != null) {
                pizza.prepareOriginalPizza();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    public String getPizzaType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入订购的披萨");
        String res = scanner.next();
        return res;
    }
}
