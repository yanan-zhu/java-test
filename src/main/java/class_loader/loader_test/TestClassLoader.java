package class_loader.loader_test;

import java.net.MalformedURLException;

/**
 * Created by zhuyanan on 17/8/28.
 */
public class TestClassLoader {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, MalformedURLException {


//        testNormal();

//        testNotInit();

//        testNotInitByArray();

//        testNotInitByFinal();


        System.out.println(TestClassLoader.class.getClassLoader());


        ClassLoader loader=TestClassLoader.class.getClassLoader();



       Class a= loader.loadClass("class_loader.loader_test.ClassLevelFirst");





        System.out.println(a.getDeclaredField("firstValue"));


//        System.out.println(TestClassLoader.class.getClassLoader().getParent());
//        System.out.println(TestClassLoader.class.getClassLoader().getParent().getParent());
//        System.out.println(TestClassLoader.class.getClassLoader().getParent().getParent().getParent());
//        System.out.println(TestClassLoader.class.getClassLoader().getParent().getParent().getParent().getParent());
//        System.out.println(TestClassLoader.class.getClassLoader().getParent().getParent().getParent().getParent().getParent());

    }


    public static void testNormal() {
        new ClassLevelThird();
    }

    /**
     * 对于静态字段，只有直接定义这个字段的类才会被初始化
     */
    public static void testNotInit() {

        System.out.println(ClassLevelThird.firstValue);

    }

    /**
     * 数组引用不会触发初始化
     */
    public static void testNotInitByArray() {

        ClassLevelThird[] classLevelThirds = new ClassLevelThird[10];

    }

    /**
     * final修饰的常量，在编译期会存入常量池，本质上没有没有引用到定义常量的类，所以不会初始化
     */
    public static void testNotInitByFinal() {

        System.out.println(ClassLevelThird.thirdStrValue);
    }

}
