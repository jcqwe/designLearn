package factory.simpleFactpry;

/***
 *@title Impl1
 *@description 实现product接口
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/9 11:22
 **/
public class Impl1 implements Product{
    @Override
    public void test(String s) {
        System.out.println("impl1" + s);
    }
}
