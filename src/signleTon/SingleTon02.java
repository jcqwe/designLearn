package signleTon;

import java.lang.reflect.Method;

/***
 *@title 单例(双重检查-懒加载)
 *@description <TODO description class purpose>
 *@author SUSER
 *@version 1.0.0
 *@create 2023/2/3 9:44
 **/
public class SingleTon02 {
    public static void main(String[] args){
        Test02 s1 = Test02.getSingle();
        Test02 s2 = Test02.getSingle();
        System.out.println(s1==s2);
    }
}
class Test02{
    private static volatile Test02 single;
    private Test02(){}


    public static Test02 getSingle() {
        if(single == null){
            synchronized (Test02.class){
                if(single == null){
                    single = new Test02();
                }
            }
        }
        return single;
    }
}