package ysu.zlj.singleTon;

/**
 * @Classname singleton
 * @Description TODO
 * @Date 2020/3/22 19:42
 * @Created by 陈刀仔
 * <p>
 *
 * 单例设计模式：一个类只能创建一个对象
 *
 * 饿汉式
 */

public class testSingleton {
    public static void main(String[] args) {
        singleTon instance1 = singleTon.getInstance();
        singleTon instance2 = singleTon.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class singleTon {
    //私有化构造器
    private singleTon() {

    }

    //私有化对象
    private static singleTon instance = new singleTon();
    //只有静态方法才能调用静态对象
    public static singleTon getInstance() {
        return instance;
    }
}
