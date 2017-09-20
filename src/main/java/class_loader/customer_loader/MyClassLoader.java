package class_loader.customer_loader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zhuyanan on 17/8/28.
 * <p>
 * supported load from .class file
 */
public class MyClassLoader extends ClassLoader {


    private String classPath;

    public MyClassLoader(String classPath) {
        super(Thread.currentThread().getContextClassLoader());//parent set null
        this.classPath = classPath;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) {

        int length;

        File file = findFile(name);

        length = (int) file.length();

        byte[] bytes = new byte[length];

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);


            length = fileInputStream.read(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return defineClass(name, bytes, 0, length);

    }

    public File findFile(String name) {

        String filePath = classPath + "/" + name.replace(".", "/") + ".class";

        return new File(filePath);

    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }
}
