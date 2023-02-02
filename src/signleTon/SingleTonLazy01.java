package signleTon;

/**
 * 单例模式懒加载(双重检查:解决线程安全)
 */
public class SingleTonLazy01 {

    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance2 == instance);
        System.out.println(instance2.hashCode() + "," + instance.hashCode());
    }
}

class SingleTon{
    //构造器私有化
    private SingleTon(){

    }
    //静态成员属性 volatile(可见性)
    private static volatile SingleTon singleTon;

    public static SingleTon getInstance(){
        if(singleTon == null){
            synchronized (SingleTon.class){
                if(singleTon == null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
