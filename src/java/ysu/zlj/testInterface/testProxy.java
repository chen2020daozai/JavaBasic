package ysu.zlj.testInterface;

/**
 * @Classname testProxy
 * @Description TODO
 * @Date 2020/3/23 18:45
 * @Created by 陈刀仔
 */

public class testProxy {
    public static void main(String[] args) {
        object obj=new objectProxy();
        obj.action();
    }
}

interface object{
    void action();
}
//代理类
class objectProxy implements object{
    object obj;

    objectProxy(){
        obj=new objectImpl();
    }
    public void action(){
        System.out.println("代理类开始执行");
        obj.action();
        System.out.println("代理类执行完毕");
    }
}
//被代理类
class objectImpl implements object{
    @Override
    public void action() {
        System.out.println("被代理类开始执行");
        System.out.println("具体操作");
        System.out.println("被代理类执行完毕");
    }
}