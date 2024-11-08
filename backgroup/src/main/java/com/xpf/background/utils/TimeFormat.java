package com.xpf.background.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 时间格式化
 */
@Component
public class TimeFormat {

    /**
     * 使用java.time格式化时间为中国时间格式
     * @param date 日期对象
     * @return 格式化后的日期时间字符串
     */
    public static String format(String date) throws ParseException {
        // 设置ISO 8601日期时间的解析格式
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        isoFormat.setTimeZone(TimeZone.getTimeZone("UTC")); // ISO 8601时间默认是UTC

        // 解析传入的ISO 8601格式字符串为Date对象
        Date d = isoFormat.parse(date);

        // 设置中国时间格式
        SimpleDateFormat chinaFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss", Locale.CHINA);
        chinaFormat.setTimeZone(TimeZone.getTimeZone("GMT+8")); // 设置为中国时区

        // 格式化日期时间为中国时间格式
        return chinaFormat.format(date);
    }

    /**
     * 使用java.time格式化时间为中国时间格式
     * @param date 日期对象
     * @return 格式化后的日期时间字符串
     */
    public String IsFormat(String date) throws ParseException {
        // 设置ISO 8601日期时间的解析格式
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        isoFormat.setTimeZone(TimeZone.getTimeZone("UTC")); // ISO 8601时间默认是UTC

        // 解析传入的ISO 8601格式字符串为Date对象
        Date d = isoFormat.parse(date);

        // 设置中国时间格式
        SimpleDateFormat chinaFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss", Locale.CHINA);
        chinaFormat.setTimeZone(TimeZone.getTimeZone("GMT+8")); // 设置为中国时区

        // 格式化日期时间为中国时间格式
        return chinaFormat.format(date);
    }
}
