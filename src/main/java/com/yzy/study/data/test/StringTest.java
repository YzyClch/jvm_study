package com.yzy.study.data.test;

public class StringTest {


    public static void main(String[] args) {
       String s1="x";
       String s2="y";
        System.out.println("xy"==s1+s2);

        final String s3="xx";
        final String s4="yy";
        System.out.println("xxyy"==s3+s4);
    }
}
