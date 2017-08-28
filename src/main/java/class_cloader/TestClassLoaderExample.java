package class_cloader;

/**
 * Created by zhuyanan on 17/8/28.
 */
public class TestClassLoaderExample {
    public static void main(String[] args) {
        staticFunction();
    }

    static TestClassLoaderExample st = new TestClassLoaderExample();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    TestClassLoaderExample() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticFunction() {
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;
}
