package ysu.zlj.singleTon;

/**
 * @Classname testSingleton1
 * @Description TODO
 * @Date 2020/3/22 20:13
 * @Created by 陈刀仔
 *
 * 懒汉式：可能存在线程安全问题
 */

public class testSingleton1 {
}
class singleTon1 {
    //私有构造器
    private singleTon1(){

    }
    //私有化对象
    private static singleTon1 instance=null;
    //静态方法
    public static singleTon1 getInstance(){
        if (instance==null){
            instance=new singleTon1();
        }
        return instance;
    }
}