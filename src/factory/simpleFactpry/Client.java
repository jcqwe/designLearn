package factory.simpleFactpry;

/***
 *@title Client
 *@description 客户端，使用Product接口
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 11:27
 **/
public class Client {
    public static void main(String[] args){
        Product product = Factory.createProduct(1);
        product.test("使用简单工厂");
    }
}
