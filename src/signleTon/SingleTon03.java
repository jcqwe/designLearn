package signleTon;

/***
 *@title 单例(静态内部类实现)
 *@description 类Test03加载时静态内部类不会被加载到内存，方法调用时才会加载，jvm能确保Test03只被实例化一次
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/3 9:55
 **/
public class SingleTon03 {
    public static void main(String[] args) {
        Test03 s1 = Test03.getSingle();
        Test03 s2 = Test03.getSingle();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode() + ","+s2.hashCode());
    }
}

class Test03 {
    private Test03(){}
    private static class Single{
        private static final Test03 single = new Test03();
    }

    public static Test03 getSingle() {
        return Single.single;
    }
}
