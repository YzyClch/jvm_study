package com.yzy.study.data.test;

public class StringTest2 {


    public static void main(String[] args) {
        String ss ="11"; // 常量池
        System.out.println(System.identityHashCode("11")); // 常量池
        System.out.println(System.identityHashCode(ss)); // 常量池
        String s2 = new String("22");  //堆空间
        System.out.println(System.identityHashCode("22"));//常量池
        System.out.println(System.identityHashCode(s2));
        String s3 = new String("33");  //堆空间
        System.out.println(System.identityHashCode("33"));//常量池

        String s5 = new String("33");  //堆空间 现在堆空间有两个33
        System.out.println(System.identityHashCode(s5)); //又在堆空间创建了"33" 这个对象

        System.out.println(System.identityHashCode(s3.intern())); // 从堆空间取出s3指向的33放进常量池
        System.out.println(System.identityHashCode(s5)); // s5还在堆空间中

        String s4 = new String("33");  //堆空间
        System.out.println(System.identityHashCode(s4)); //又在堆空间创建了"33" 这个对象

    }
}
