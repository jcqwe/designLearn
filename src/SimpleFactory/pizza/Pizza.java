package SimpleFactory.pizza;

/**
 * pizza抽象类（提供pizza制作过程方法）
 */
public abstract class Pizza {
    //披萨种类
    private String PizzaName;

    public abstract void prepareOriginalPizza();


    public void bake(){
        System.out.println(PizzaName + "开始bake");
    }
    public void cut(){
        System.out.println(PizzaName + "开始cut");
    }
    public void box(){
        System.out.println(PizzaName + "开始box");
    }
    public void setPizzaName(String pizzaName) {
        PizzaName = pizzaName;
    }
}
