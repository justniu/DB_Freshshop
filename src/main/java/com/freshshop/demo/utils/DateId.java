package com.freshshop.demo.utils;

import org.testng.annotations.Test;

import java.util.Random;

public class DateId {
    public static String toStr() {
        Random random = new Random();
        return String.valueOf(System.currentTimeMillis())+String.valueOf(random.nextInt(1000000)+100);
    }
    @Test
    public void test(){
        System.out.println(DateId.toStr());
    }
}
