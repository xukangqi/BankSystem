package com.bank.utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateControlForLoan {
    //将一个 String 变为 两位小数的 double
    public static double toCriterionD(String amount) {
        DecimalFormat df = new DecimalFormat("######0.00");
        return Double.valueOf( df.format(Double.valueOf(amount)) );
    }

    public static double toCriterionD(double amount) {
        DecimalFormat df = new DecimalFormat("######0.00");
        return Double.valueOf( df.format(amount) );
    }

    // 还款期数下对应的还款日期，次月当天开始还款，考虑到借款日为 29，30，31情况，若还款日月份没有此日期，则为最接近该日的当月日期。
    // 如借款日为31号，则4月为20号还款，闰年2月为29号，
    public static String getExpirationDate(int insCount) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //循环月，年
        for (int i = 0; i < insCount; i++) {
            if(++month == 13) {
                month = 1;
                ++year;
            }
        }
        String strDate = null;
        while(true) {
            // yyyy-MM-dd HH:mm:ss 的格式
            strDate = year + "-" + month + "-" + day + " 23:59:59";
            if(isValidDate(strDate)) { break; }
            --day;
        }

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(strDate);
            long ts = date.getTime();
            String res = String.valueOf(ts);
            return res;

        } catch (Exception e) {
            return "Error";
        }

    }

    //判断一个日期是否为合法日期
    public static boolean isValidDate(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            format.setLenient(false);
            Date date = format.parse(strDate);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //获取时间戳得出时间戳所在时间的23:59:59的时间戳
    public static String getTimestampAboutEndOfDay() {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String s = year+ "-" + month+ "-" + day + " 23:59:59";
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(s);
            long ts = date.getTime();
            res = String.valueOf(ts);
            return res;
        }catch (ParseException e) {
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(DateControlForLoan.getTimestampAboutEndOfDay());
    }
}
