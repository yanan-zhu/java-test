package class_cloader;

/**
 * Created by zhuyanan on 17/8/28.
 */
public class ClassLevelThird extends ClassLevelSecond {
    static {
        System.out.println("third static");
    }

    public static int thirdValue = 3;

    public static final String thirdStrValue = "not init";

    public ClassLevelThird() {
        System.out.println("third init");
    }
}
