package com.balldance.baller.util;

public class TimeUtil {
    public static String getTime() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String getTime(String beforeTime, int seconds) {
        long baseTime = 0;
        try {
            baseTime = Long.valueOf(beforeTime)
        } catch (Exception e) {
            System.out.println("get time error with:" + e.toString());
        }
        if (baseTime == 0) {
            return "";
        }
        return String.valueOf(baseTime + seconds * 1000);
    }
}
