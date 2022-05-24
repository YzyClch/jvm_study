//package com.yzy.study.data.test;
//
//public class ClassOut {
//
//    class MyClassLoad extends ClassLoader{
//
//        @Override
//        public Class<?> loadClass(String name) throws ClassNotFoundException {
//            return super.loadClass(name);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int x=8;
//        x+=1;
//        System.out.println(x);
//
//        ClassLoader classLoader1 = new ClassLoader();
//
//        ClassLoader classLoader = ClassOut.class.getClassLoader();
//        classLoader.loadClass()
//        // javap -v ClassOut.class 查看字节码文件
//
//
//
//    }
//}
