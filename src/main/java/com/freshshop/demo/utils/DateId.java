package com.freshshop.demo.utils;

import java.util.Random;

public class DateId {
    public String toString() {
        Random random = new Random();
        return String.valueOf(System.currentTimeMillis())+String.valueOf(random.nextInt(1000000)+100);
    }
}
