package com.example.springbootstarter.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
    private static Date date = new Date();
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getDate() {
        return sdf.format(date);
    }
}
