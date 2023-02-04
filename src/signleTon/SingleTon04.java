package signleTon;

/***
 *@title 单例(枚举实现)
 *@description 该实现可以防止反射攻击（JVM 保证只会实例化一次）
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/3 10:02
 **/
public class SingleTon04 {
    public static void main(String[] args){
        Test04 s1 = Test04.SINGLE;
        Test04 s2 = Test04.SINGLE;
        System.out.println(s1== s2);
    }
}
enum Test04{
    SINGLE;
    public void method(){
        System.out.println("test");
    }
}
