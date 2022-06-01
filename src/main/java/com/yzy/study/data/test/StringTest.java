package com.yzy.study.data.test;

public class StringTest {


    public static void main(String[] args) {
//       String s1="x";
//       String s2="y";
//        System.out.println("xy"==s1+s2);
//
//        final String s3="xx";
//        final String s4="yy";
//        System.out.println("xxyy"==s3+s4);
//
//
//        String trim = new String("xxxxxx").intern();
//        System.out.println();

        String s3 =new String("a") + new String("b");
//        String s4 ="11";
//        s3=s3.intern();
//        System.out.println(s3==s4);
        String intern = s3.intern();
        System.out.println(intern==s3);
        System.out.println(s3 == "ab");
    }
}
