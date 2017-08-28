package class_cloader;

/**
 * Created by zhuyanan on 17/8/28.
 */
public class ClassLevelSecond extends ClassLevelFirst {

    static {
        System.out.println("second static");
    }

    public static int secondValue = 2;

    public ClassLevelSecond() {
        System.out.println("second init");
    }

}
