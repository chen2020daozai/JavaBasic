package ysu.zlj.testInterface;

/**工厂方法设计模式
 * @Classname TestFactoryMethod
 * @Description TODO
 * @Date 2020/3/23 15:15
 * @Created by 陈刀仔
 */

public class TestFactoryMethod {
    public static void main(String[] args) {
        WorkFactory t=new teacherWorkFactory();
        t.getwork().dowork();
        WorkFactory s=new studentWorkFactory();
        s.getwork().dowork();
    }
}

interface WorkFactory{
    Work getwork();
}
class teacherWorkFactory implements WorkFactory{
    @Override
    public Work getwork() {
        return new teacherWork();
    }
}
class studentWorkFactory implements WorkFactory{
    @Override
    public Work getwork() {
        return new studentWork();
    }
}

interface Work{
    void dowork();
}
class teacherWork implements Work{
    @Override
    public void dowork() {
        System.out.println("老师批改作业");
    }
}
class studentWork implements Work{

    @Override
    public void dowork() {
        System.out.println("学生做作业");
    }
}