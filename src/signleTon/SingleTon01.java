package signleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 *@title 单例(饿汉式)
 *@description 类加载的时候就创建该实例 ，线程安全但是效率低
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/3 9:30
 **/
public class SingleTon01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Test01 s1 = Test01.getSingle();

        //反射获取构造器
        Constructor declaredConstructors = Test01.class.getDeclaredConstructor();
        //修改构造器的修饰符为public
        declaredConstructors.setAccessible(true);
        //通过构造器创建实例对象
        Test01 s2 = (Test01) declaredConstructors.newInstance();

        System.out.println(s1 == s2);

//        System.out.println(s1 == s2);
//        System.out.println(s1.hashCode() + "," + s2.hashCode());
    }
}

class Test01{
    private static Test01 single = new Test01();
    private Test01(){}
    public static Test01 getSingle() {
        return single;
    }
}
