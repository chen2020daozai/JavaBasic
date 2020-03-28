package ysu.zlj.testInnerClass;

/**局部内部类
 * @Classname TestInnerClass1
 * @Description TODO
 * @Date 2020/3/24 9:28
 * @Created by 陈刀仔
 */

public class TestInnerClass1 {

}

//局部内部类的用途
class outclass{
    //如果一个方法的返回值是某个类或者接口的时候，使用局部内部类

    public Comparable getComparable() {
        //创建一个实现Comparable接口的类
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        //返回一个实现类的对象
        return new MyComparable();
    }

    //匿名内部类，就是只有new没有声明
    public Comparable getComparable1(){
        //Comparable()不是接口的构造器，接口没有构造器，是他的实现类的构造器
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}