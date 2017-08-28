package class_cloader;

/**
 * Created by zhuyanan on 17/8/28.
 */
public class ClassLevelFirst {

    static {
        System.out.println("first static");
    }
    public static int firstValue = 1;

    public ClassLevelFirst() {
        System.out.println("first init");
    }
}
