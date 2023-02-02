package signleTon;

/**
 * 单例模式懒加载(枚举解决)
 */
public class SingleTonLazy02 {

    public static void main(String[] args) {
        SingleTonImplEnum instance = SingleTonImplEnum.INSTANCE;
        SingleTonImplEnum instance2 = SingleTonImplEnum.INSTANCE;
        System.out.println(instance2 == instance);
        System.out.println(instance2.hashCode() + "," + instance.hashCode());
    }
}
//枚举的成员属性底层是 public static final类型的 SingleTonImplEnum INSTANCE = new SingleTonImplEnum();即定义一个成员变量只会生成一个实例
enum SingleTonImplEnum{
    INSTANCE;
    public void test(){
        System.out.println("haha");
    }
}
