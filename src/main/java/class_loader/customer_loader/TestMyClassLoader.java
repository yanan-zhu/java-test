package class_loader.customer_loader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhuyanan on 17/8/30.
 */
public class TestMyClassLoader {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, InterruptedException {


        while (true) {


            Thread.sleep(10);

            MyClassLoader myClassLoader = new MyClassLoader("/Users/zhuyanan/work/tests/design-pattern/target/classes");

            Class<?> dogClass = myClassLoader.loadClass("bean.Dog");


            Object dogObj = dogClass.newInstance();

            Method hello = dogClass.getMethod("hello", null);


            hello.invoke(dogObj);


            Dog myDog = new Dog();

            myDog.hello();
        }

    }

}
