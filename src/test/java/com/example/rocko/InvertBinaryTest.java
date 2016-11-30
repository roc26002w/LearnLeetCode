package com.example.rocko;

import org.junit.Test;

/**
 * Created by Rocko on 2016/11/30.
 */
public class InvertBinaryTest {

    /**
     * 將正整數 a 的數跟 b 的數交換
     */
    @Test
    public void testInvertBinaryInt(){
        int a = 10;
        int b = 20;


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }


    /**
     * 將有負數 a 的數跟 b 的數交換
     */
    @Test
    public void testInvertBinary(){
        int a = 10;
        int b = -20;


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);

    }
}
