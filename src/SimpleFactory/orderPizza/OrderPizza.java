package SimpleFactory.orderPizza;

import SimpleFactory.pizza.CheesePizza;
import SimpleFactory.pizza.GreekPizza;
import SimpleFactory.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {
    //    public OrderPizza() {
//        Pizza pizza = null;
//        String pizzaType = "";
//        do {
//            pizzaType = getPizzaType();
//            if (pizzaType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setPizzaName("奶酪披萨");
//            } else if (pizzaType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setPizzaName("希腊披萨");
//            } else {
//                break;
//            }
//            pizza.prepareOriginalPizza();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
    SimpleFactory simpleFactory;
    Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            pizza = this.simpleFactory.getPizza(getPizzaType());
            if (pizza != null) {
                pizza.prepareOriginalPizza();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购pizza失败");
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
