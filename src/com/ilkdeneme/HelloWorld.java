package com.ilkdeneme;

import com.sun.jdi.IntegerType;

import java.security.KeyStore;
import java.text.Format;
import java.util.Arrays;
import java.util.stream.IntStream;

public class HelloWorld{
    public static void main(String[] args){
        IntStream intStream_1 = IntStream.range(10, 20); //Range i listeye çevirme
        int[] intStream = new int[] {1,2,456463}; // baştan liste tanımlama
        Integer[] intStream_2 = new Integer[] {1,2,3,4,5,5,6}; /* baştan liste tanımlamak için 2.yol integer classını kullanmak*/
        Integer[] intStream_3 = new Integer[5]; //  {0,0,0,0,0}
        System.out.println(Arrays.toString(intStream_3));
        intStream_3[0] = 5; // {5,0,0,0,0}
        String[] strlist = new String[] {"safas", "wqgqwg", "ewgqklgj"}; // Str listesi tanımlama

        byte denemevariable = 1;
        short variable_2 = 1232;
        long variable_4 = 3895723895L;
        float deneme_1 = 14.928F;
        double deneme2 = 14.1925125;
        int variable3 = 12412512;
        char letter = 'A';
        boolean deneme2312 = true;
        System.out.println(deneme_1);
        System.out.println(intStream[0]);
        String string1 = "ASDASDASD";
        System.out.printf("String1: %s\nString2: qwgwqg", string1);

        //liste dönme
        for (int i: intStream) {
            System.out.println(i);
        }//liste dönme

        int a = 825;
        System.out.println(a);

        //Range dönme
        for (int i = 0; i<100; i = i+5){
            System.out.println(i);
            a += 1;
        }
        //Range dönme

    }
}