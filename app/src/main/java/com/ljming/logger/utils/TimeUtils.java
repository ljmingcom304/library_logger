package com.ljming.logger.utils;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

   /**
    * 把日期毫秒转化为字符串。默认格式：yyyy-MM-dd HH:mm:ss。
    *
    * @param millis 要转化的日期毫秒数。
    * @return 返回日期字符串（如："2013-02-19 11:48:31"）。
    */
   public static String millisToStringDate(long millis) {
      return millisToStringDate(millis, "yyyy-MM-dd HH:mm:ss");
   }

   /**
    * 把日期毫秒转化为字符串。
    *
    * @param millis  要转化的日期毫秒数。
    * @param pattern 要转化为的字符串格式（如：yyyy-MM-dd HH:mm:ss）。
    * @return 返回日期字符串。
    */
   @SuppressLint("SimpleDateFormat")
   public static String millisToStringDate(long millis, String pattern) {
      SimpleDateFormat format = new SimpleDateFormat(pattern);
      return format.format(new Date(millis));

   }

}
