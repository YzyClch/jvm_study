package com.yzy.study.data.eq;

import java.io.IOException;
import java.io.InputStream;

public class MyClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader myClassLoader = new ClassLoader() {

            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1)+".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }

            }
        };

        Object o = myClassLoader.loadClass("com.yzy.study.data.eq.MyClass").newInstance();
        System.out.println(o instanceof MyClass);
    }
}
