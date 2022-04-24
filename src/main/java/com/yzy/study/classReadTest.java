package com.yzy.study;

import java.io.FileInputStream;
import java.io.IOException;
import javax.lang.model.SourceVersion;
public class classReadTest
{

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@d2cc05a

        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        // 用户自定义类用的都是AppClassLoader
        System.out.println(classReadTest.class.getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2

        // java核心类库都是使用引导类加载器进行加载的
        System.out.println(String.class.getClassLoader());//null

        System.out.println(SourceVersion.class.getClassLoader());
        System.out.println(1|2); //01

    }


//    public static void main(String[] args) throws IOException {
//        byte[]b=new byte[1024];
//        FileInputStream fi=new FileInputStream("D:\\study\\jvm_study\\target\\classes\\com\\yzy\\study\\classReadTest.class");
//        fi.read(b);
//
//        System.out.println(b[0]); //-54
//        System.out.println(Integer.toBinaryString(b[0]));      //11111111111111111111111111001010
//        System.out.println(Integer.toBinaryString(0xFF));   //000000000000000000000000011111111
//        System.out.println(Integer.toHexString(b[0]));
//
//    }

    private static String toHex(byte[] result) {
        StringBuffer sb = new StringBuffer(result.length * 2);
        for (int i = 0; i < result.length; i++) {
            sb.append(Character.forDigit((result[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(result[i] & 15, 16));
        }
        return sb.toString();
    }
}
