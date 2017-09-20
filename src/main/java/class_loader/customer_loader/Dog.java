package class_loader.customer_loader;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by zhuyanan on 17/8/31.
 */
public class Dog implements Animal {

    private int length = 1024000;

    private Long[] elements = new Long[length];

    private static final Level CUSTOMLEVEL = new Level("test", 550) {
    }; // anon class!


    @Override
    public void speak() {
        speak("sth");

    }

    @Override
    public void hello() {

        Long index = 0l;

        for (int i = 0; i < length; i++) {
            elements[i] = index++;
        }


        speak("hello");
        speak(this.getClass().getName() + "   classLoader:" + this.getClass().getClassLoader().toString());
        speak("elements[" + (length - 1) + "]=" + elements[length - 1]);


        Logger.getLogger("test").log(CUSTOMLEVEL, "doGet called");

    }

    @Override
    public void speak(String sth) {
        System.out.println(sth);
    }


}
