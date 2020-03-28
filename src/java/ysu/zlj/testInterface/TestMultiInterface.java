package ysu.zlj.testInterface;

/**接口多态性
 * @Classname TestMultiInterface
 * @Description TODO
 * @Date 2020/3/23 14:51
 * @Created by 陈刀仔
 */

public class TestMultiInterface {
    public static void main(String[] args) {
        runner r=new player();
        r.run();
        swimmer s=new player();
        s.swim();
    }
}
interface runner{
    public abstract void run();
}
interface swimmer{
    void swim();
}
class player implements runner,swimmer {
    public void run(){
        System.out.println("跑步");
    }
    public void swim(){
        System.out.println("游泳");
    }
}