package factory.simpleFactpry;

/***
 *@title Factory
 *@description 用来创建Product对象的工厂
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 11:23
 **/
public class Factory {

    /**
     * 具体创建Product对象的方法
     * @param type 根据类型返回不同的实现Product的对象
     * @return Product对象
     */
    public static Product createProduct(int type){
        Product product = null;
        if(type == 1){
            product = new Impl1();
        }else if(type == 2){
            product = new Impl2();
        }
        return product;
    }
}
