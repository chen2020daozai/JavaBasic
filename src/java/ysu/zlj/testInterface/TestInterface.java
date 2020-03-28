package ysu.zlj.testInterface;

/**
 * @Classname TestInterface
 * @Description TODO
 * @Date 2020/3/23 11:18
 * @Created by 陈刀仔
 */

public class TestInterface {

}

interface in1 {
    //常量       默认public static final  都是常量
    public static final int I1 = 5;
    int I2 = 10;

    //抽象方法  默认public abstrct
    public abstract void fun1();

    void fun2();
}

abstract class AA {
    abstract void fun3();
}

class BB extends AA implements in1 {
    //接口中fun1()方法是public，BB中必须也是public
    public void fun1() {
        int a = 0;
    }

    public void fun2() {
        int a = 0;
    }

    void fun3() {
        int a = 0;
    }
}