package com.xpf.background.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 时间格式化工具类
 */
@Component
public class TimeFormat {

    // 用于解析Date.toString()产生的日期字符串的格式
    private static final SimpleDateFormat defaultDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

    // 用于格式化日期为中文格式
    private static final SimpleDateFormat chinaFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss", Locale.CHINA);

    static {
        // 设置中国时区
        chinaFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
    }

    /**
     * 将Date对象格式化为中国时间格式
     * @param date Date对象
     * @return 中国时间格式的日期字符串
     */
    public static String formatToChinaTime(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }
        synchronized (chinaFormat) { // 同步以确保线程安全
            return chinaFormat.format(date);
        }
    }

    /**
     * 将标准日期字符串格式化为中国时间格式
     * @param dateString 标准日期字符串
     * @return 中国时间格式的日期字符串
     * @throws ParseException 如果日期字符串无法被解析
     */
    public static String formatToChinaTimeString(String dateString) throws ParseException {
        if (dateString == null || dateString.isEmpty()) {
            throw new IllegalArgumentException("Date string cannot be null or empty.");
        }
        synchronized (defaultDateFormat) { // 同步以确保线程安全
            Date date = defaultDateFormat.parse(dateString);
            return formatToChinaTime(date);
        }
    }

    /**
     * 将标准日期字符串格式化为中国时间格式（非静态方法）
     * @param dateString 标准日期字符串
     * @return 中国时间格式的日期字符串
     * @throws ParseException 如果日期字符串无法被解析
     */
    public String formatToChinaTimeStringInstance(String dateString) throws ParseException {
        return formatToChinaTimeString(dateString);
    }
}