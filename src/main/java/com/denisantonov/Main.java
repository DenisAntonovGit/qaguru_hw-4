package com.denisantonov;

public class Main {
    public static void main(String[] args) {
        //stack overflow
        short one = 32767;
        System.out.println((short) (one + 20));
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a + 4);

        //Examples of calculation
        byte first = -127;
        short second = 200;
        int third = 12000;
        long fourth = 20000L;
        float fifth = 0.1f;
        double sixth = 10.01d;
        System.out.println(first + second);
        System.out.println(second - first);
        System.out.println(third * sixth);
        System.out.println(fifth / second);
        System.out.println(fourth % sixth);

        //Examples of equalities

        if (third != fourth);
        System.out.println("It's true, they are not equal");
    }
}
