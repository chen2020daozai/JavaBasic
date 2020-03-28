package ysu.zlj.testInnerClass;

/**
 * @Classname TestInnerClass
 * @Description TODO
 * @Date 2020/3/24 9:00
 * @Created by 陈刀仔
 */

public class TestInnerClass {
    public static void main(String[] args) {
        animal.dog d = new animal.dog();
        animal a = new animal();
        animal.bird b = a.new bird();
        b.info();
        b.setName("内部类setName");
    }
}

class animal{
    int age;
    String name="外部类name";
    public void show(){
        System.out.println("我是show方法");
    }
    //非静态成员内部类
    class bird{
        String name="内部类name";
        public void setName(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(animal.this.name);
        }
        public void info(){
            show();
        }
    }
    //静态成员内部类
    static class dog{

    }
}