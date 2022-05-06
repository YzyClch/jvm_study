//package com.yzy.study;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class FileReadTest {
//    static int countLegs (List<? extends Animal > animals ) {
//        int retVal = 0;
//        for ( Animal animal : animals )
//        {
//            retVal += animal.countLegs();
//        }
//        return retVal;
//    }
//
//    static int countLegs1 (List< Animal > animals ){
//        int retVal = 0;
//        for ( Animal animal : animals )
//        {
//            retVal += animal.countLegs();
//        }
//        return retVal;
//    }
//
//    public static void main(String[] args) {
//        List<Dog> dogs = new ArrayList<>();
//        // 不会报错
//        countLegs( dogs );
//        // 报错
//        countLegs1(dogs);
//    }
//
//    public static void main(String[] args) throws IOException {
//        Properties p=new Properties();
//        p.load(new FileInputStream("D:\\study\\jvm_study\\src\\main\\resources\\p.properties"));
//        String k = p.getProperty("k");
//        System.out.println(k);
//        System.out.println(System.getProperties());
//    }
//}
